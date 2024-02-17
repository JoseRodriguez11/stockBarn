
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Inventario;
import modelo.Producto;


public class ProductoDAO {
    
    final private Connection con;//se realiza la conneccion con la base de datos
    private int idProducto;
    
    
    /**
     * Constructor para crear un objeto InventarioDAO.
     *
     * @param con La conexión a la base de datos.
    */
    public ProductoDAO(Connection con){
        this.con=con;
    }
    
    
    
    public void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al cerrar la conexión.", e);
        }
    }   
    
    
    /**
     * Guarda un nuevo registro de producto en la base de datos.
     *
     * @param producto El objeto Producto que se va a guardar.
    */
    public void guardarRegistro(Producto producto) {
        try {
            final String query = "INSERT INTO PRODUCTOS (nombre, presentacion, categoria, marca, provedor, lote, descripcion) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                registroProducto(producto, statement);
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idProducto = generatedKeys.getInt(1);
                }
            }
        
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
     /**
     * Registra los detalles del producto en el PreparedStatement dado.
     *
     * @param producto  El objeto Producto que contiene los detalles a registrar.
     * @param statement El PreparedStatement donde se registrarán los detalles.
     * @throws SQLException Si hay un error al acceder a la base de datos.
     */
    public void registroProducto(Producto producto, PreparedStatement statement) throws SQLException {
        statement.setString(1, producto.getNombreProducto());
        statement.setString(2, producto.getPresentacion());
        statement.setString(3, producto.getCategoria());
        statement.setString(4, producto.getMarca());
        statement.setString(5, producto.getProvedor());
        statement.setString(6, producto.getNumeroLote());
        statement.setString(7, producto.getDescripcion());
        statement.execute();
        
    }
    
    public int getIdGenerado() {
        System.out.println(idProducto);
        return idProducto;
    }
   
     /**
     * Desactiva un producto en la base de datos estableciendo su disponibilidad a false.
     *
     * @param id El ID del producto a desactivar.
     * @return El número de filas afectadas por la actualización.
     */
    public int desactivar(int id) {
        try (PreparedStatement statement = con.prepareStatement("UPDATE PRODUCTOS SET DISPONIBILIDAD = 0 WHERE ID = ?")) {
            statement.setInt(1, id);

            int updateCount = statement.executeUpdate();
            return updateCount;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    /*
      realiza la modificacion y su inventario asociado en la base de datos
    */
    public int modificar(int id, String nombreProducto, String presentacion, String categoria, String marca, String provedor, String lote, String descripcion, int cantidadUnidades, String estante) {
        try (PreparedStatement statement = con.prepareStatement(
                "UPDATE PRODUCTOS P "
                + "INNER JOIN INVENTARIO I ON P.ID = I.PRODUCTOID "
                + "SET "
                + "P.NOMBRE = ?"
                + ", P.PRESENTACION = ?"
                + ", P.CATEGORIA = ?"
                + ", P.MARCA = ?"
                + ", P.PROVEDOR = ?"
                + ", P.LOTE = ?"
                + ", P.DESCRIPCION = ?"
                + ", I.CANTIDADUNIDADES = ?"
                + ", I.ESTANTE = ?"
                + " WHERE P.ID = ?")) {
            statement.setString(1, nombreProducto);
            statement.setString(2, presentacion);
            statement.setString(3, categoria);
            statement.setString(4, marca);
            statement.setString(5, provedor);
            statement.setString(6, lote);
            statement.setString(7, descripcion);
            statement.setInt(8, cantidadUnidades);
            statement.setString(9, estante);
            statement.setInt(10, id);

            int updateCount = statement.executeUpdate();
            return updateCount;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
    
    /**
     * Busca productos en la base de datos por nombre y devuelve una lista de productos con detalles de inventario asociados.
     *
     * @param nombreProducto El nombre del producto a buscar.
     * @return Una lista de objetos Producto que coinciden con el criterio de búsqueda.
     */
    public List<Producto> mostarPorBusqueda(String nombreProducto) {
        List<Producto> resultado = new ArrayList<>();
        try (PreparedStatement statement = con.prepareStatement(
                "SELECT P.ID, P.NOMBRE, P.PRESENTACION, P.CATEGORIA, P.MARCA, P.PROVEDOR, P.LOTE, P.DESCRIPCION, P.DISPONIBILIDAD, V.CANTIDADUNIDADES, V.ESTANTE "
                + "FROM PRODUCTOS P "
                + "INNER JOIN INVENTARIO V ON P.ID = V.PRODUCTOID "
                + "WHERE P.NOMBRE LIKE ?")) {
            statement.setString(1, "%" + nombreProducto + "%");

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    if (resultSet.getByte("DISPONIBILIDAD") == 1) {
                        String productoNombre = resultSet.getString("NOMBRE");
                        if (productoNombre.contains(nombreProducto)) {
                            int productoId = resultSet.getInt("ID");
                            String productoPresentacion = resultSet.getString("PRESENTACION");
                            String productoCategoria = resultSet.getString("CATEGORIA");
                            String productoMarca = resultSet.getString("MARCA");
                            String productoProveedor = resultSet.getString("PROVEDOR");
                            String productoLote = resultSet.getString("LOTE");
                            String productoDescripcion = resultSet.getString("DESCRIPCION");

                            Producto producto = resultado.stream()
                                    .filter(pro -> pro.getId() == productoId)
                                    .findAny()
                                    .orElseGet(() -> {
                                        Producto pro = new Producto(productoId, productoNombre, productoPresentacion, productoCategoria, productoMarca, productoProveedor, productoLote, productoDescripcion);
                                        resultado.add(pro);
                                        return pro;
                                    });

                            Inventario datosInventario = new Inventario(resultSet.getString("ESTANTE"), resultSet.getInt("CANTIDADUNIDADES"));
                            producto.agregar(datosInventario);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
    
    
    
    /**
     * Verifica si ya existe un registro para un producto dado en la base de datos.
     *
     * @param producto El producto para verificar su existencia en la base de datos.
     * @return true si el producto ya existe en la base de datos, de lo contrario, false.
     */
    public boolean verificarRegistro(Producto producto) {
        try (PreparedStatement statement = con.prepareStatement(
                "SELECT COUNT(*) AS EXISTE_PRODUCTO "
                + "FROM PRODUCTOS "
                + "WHERE NOMBRE = ? AND PRESENTACION = ? AND MARCA = ? AND LOTE = ?")) {
            statement.setString(1, producto.getNombreProducto());
            statement.setString(2, producto.getPresentacion());
            statement.setString(3, producto.getMarca());
            statement.setString(4, producto.getNumeroLote());

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getInt("EXISTE_PRODUCTO") > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    
    
    
}
