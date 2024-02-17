
package control;

import dao.ProductoDAO;
import factory.ConexionFactory;
import java.util.List;
import modelo.Producto;


public class ProductoController {
    private final ProductoDAO productoDAO;
    private static ConexionFactory factory = ConexionFactory.getInstance();

    public ProductoController(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
    
    public ProductoController(){
        this.productoDAO=new ProductoDAO(factory.conexion());
    }
    
    public void guardarRegistro(Producto producto,String categoria){
        producto.setCategoria(categoria);
        productoDAO.guardarRegistro(producto);
    }
    
    public int desactivar(int id){
        return productoDAO.desactivar(id);
        
    }
    
    public int modificar(int id,String nombreProducto,String presentacion,String categoria,String marca,String provedor,String lote,String descripcion,int cantidadUnidades,String estante){
        return productoDAO.modificar(id, nombreProducto, presentacion, categoria, marca, provedor, lote, descripcion, cantidadUnidades, estante);
    }
    
    
    public List<Producto> mostarPorBusqueda(String nombre){
        return productoDAO.mostarPorBusqueda(nombre);
    }
    public int productoId(int id){
        return id;
    }
    
    public int getIdGenerado() {
        return productoDAO.getIdGenerado();
    }
    
    public boolean verificarRegistro(Producto producto){
        return productoDAO.verificarRegistro(producto);
    }
    public void cerrarConexion(){
        productoDAO.cerrarConexion();
    }

}
