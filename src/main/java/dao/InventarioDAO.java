
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Inventario;
import modelo.Producto;


public class InventarioDAO {
    
    final private Connection con;  //se realiza la conneccion con la base de datos
    private LocalDate fecha=LocalDate.now(); //varieble para obtener la hora actual 
    
    
     /**
     * Constructor para crear un objeto InventarioDAO.
     *
     * @param con La conexión a la base de datos.
     */
    public  InventarioDAO(Connection con) {
        this.con = con;
    }
    
    
     /**
     * Guarda un nuevo registro de inventario en la base de datos.
     *
     * @param inventario El objeto Inventario que se va a guardar.
     */

    public void guardarInventario(Inventario inventario) {
        try {
            final String query = "INSERT INTO INVENTARIO (cantidadUnidades, estante, productoId) VALUES (?, ?, ?)";
            try (PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                registroInventario(inventario, statement);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
     /**
     * Registra los detalles del inventario en el PreparedStatement dado.
     *
     * @param inventario El objeto Inventario que contiene los detalles a registrar.
     * @param statement  El PreparedStatement donde se registrarán los detalles.
     * @throws SQLException Si hay un error al acceder a la base de datos.
     */

    public void registroInventario(Inventario inventario, PreparedStatement statement) throws SQLException {
        statement.setInt(1, inventario.getCantidadUnidades());
        statement.setString(2, inventario.getEstante());
        statement.setInt(3, inventario.getProductoId());
        statement.execute();
    }
    
    
      /**
     * Obtiene una lista de productos con sus detalles de inventario asociados desde la base de datos.
     *
     * @return Una lista de objetos Producto con detalles de inventario.
     */
    public List<Producto> listarConInventario() {
        List<Producto> resultado = new ArrayList<>();
        try (PreparedStatement statement = con.prepareStatement(
                "SELECT P.ID, P.NOMBRE, P.PRESENTACION, P.CATEGORIA, P.MARCA, P.PROVEDOR, P.LOTE, P.DESCRIPCION, P.DISPONIBILIDAD, V.CANTIDADUNIDADES, V.ESTANTE "
                + "FROM PRODUCTOS P "
                + "INNER JOIN INVENTARIO V ON P.ID = V.PRODUCTOID")) {

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) { 
                    if (resultSet.getBoolean("DISPONIBILIDAD")) {
                     
                        int productoId = resultSet.getInt("ID");
                        String productoNombre = resultSet.getString("NOMBRE");
                        String productoPresentacion = resultSet.getString("PRESENTACION");
                        String productoCategoria = resultSet.getString("CATEGORIA");
                        String productoMarca = resultSet.getString("MARCA");
                        String productoProvedor = resultSet.getString("PROVEDOR");
                        String productoLote = resultSet.getString("LOTE");
                        String productoDescripcion = resultSet.getString("DESCRIPCION");

                        Producto producto = resultado.stream()
                                .filter(pro -> pro.getId() == productoId)
                                .findAny()
                                .orElseGet(() -> {
                                    Producto pro = new Producto(productoId, productoNombre, productoPresentacion, productoCategoria, productoMarca, productoProvedor, productoLote, productoDescripcion);
                                    resultado.add(pro);
                                    return pro;
                                });

                        Inventario datosInventario = new Inventario(resultSet.getString("ESTANTE"), resultSet.getInt("CANTIDADUNIDADES"));
                        producto.agregar(datosInventario);
                    }
                }
            }
            } catch (SQLException e) {

                throw new RuntimeException(e);
            }
            return resultado;
    }
    
    
    
     /**
     * Registra los productos sacados en la base de datos.
     *
     * @param id            El ID del producto sacado.
     * @param cantidadsacar La cantidad de productos sacados.
     * @param fecha         La fecha en que se sacaron los productos.
     */
    public void registarProductosSacados(int id,int cantidadsacar,LocalDate fecha){
        
        try {
            final String query = "INSERT INTO PRODUCTOS_SACADOS (productoId, fecha, cantidad_sacada) VALUES (?, ?, ?)";
            try (PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                statement.setInt(1, id);
                statement.setDate(2, java.sql.Date.valueOf(fecha));
                statement.setInt(3, cantidadsacar);
                statement.execute();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }

    
    
    
     /**
     * Retira la cantidad especificada de productos del inventario y actualiza la base de datos.
     *
     * @param id            El ID del producto a sacar.
     * @param cantidadsacar La cantidad de productos a sacar.
     * @return true si los productos se sacaron con éxito, de lo contrario, false.
     */
    public boolean  sacarProductos(int id,int cantidadsacar){
        try (PreparedStatement statement = con.prepareStatement(
                "SELECT CANTIDADUNIDADES,PRODUCTOS_SACADOS  FROM INVENTARIO WHERE PRODUCTOID = ? ")) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if(resultSet.next()){
                    int cantidadunidades= resultSet.getInt("CANTIDADUNIDADES");
                    int productosacado= resultSet.getInt("PRODUCTOS_SACADOS");
                    if(cantidadsacar < cantidadunidades){
                        int nuevacantidad= cantidadunidades - cantidadsacar;
                        int totalcantidadsacra=productosacado + cantidadsacar ;
                        registarProductosSacados(id, cantidadsacar, fecha);
                        modifiarCantidadyProductosSacados(nuevacantidad, totalcantidadsacra, id);
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }  
        return false;
    }
    
    
     /**
     * Actualiza la cantidad de productos en el inventario y el total de productos sacados en la base de datos.
     *
     * @param nuevaCantidad            La nueva cantidad de productos en el inventario.
     * @param cantidadProductosSacados La nueva cantidad total de productos sacados.
     * @param id                       El ID del producto.
     */
    public void modifiarCantidadyProductosSacados(int nuevaCantidad,int cantidadProductosSacados,int id){
        try (PreparedStatement statement = con.prepareStatement(
                "UPDATE INVENTARIO SET CANTIDADUNIDADES = ? , PRODUCTOS_SACADOS = ? WHERE PRODUCTOID = ? ")) {
            statement.setInt(1, nuevaCantidad);
            statement.setInt(2, cantidadProductosSacados);
            statement.setInt(3, id);
            
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     /**
     * Verifica si existe un registro para un producto dado en la base de datos.
     */
    public boolean verificarRegistroPorId(int id) {
        try (PreparedStatement statement = con.prepareStatement(
                "SELECT COUNT(*) AS EXISTE_PRODUCTO "
                + "FROM  INVENTARIO "
                + "WHERE PRODUCTOID = ? ")) {
            statement.setInt(1, id);
      
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getInt("EXISTE_PRODUCTO") > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
