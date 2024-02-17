
package control;

import dao.InventarioDAO;
import factory.ConexionFactory;
import java.util.List;
import modelo.Inventario;
import modelo.Producto;


public class InventarioController {
    
    private static ConexionFactory factory = ConexionFactory.getInstance();
    private InventarioDAO inventarioDAO;

    public InventarioController() {
        this.inventarioDAO = new InventarioDAO(factory.conexion());
    }
    
    public void guardarInventario(Inventario inventario,int id){
        inventario.setProductoId(id);
        inventarioDAO.guardarInventario(inventario);
    }
     
     public List<Producto> listarConInventario(){
         return this.inventarioDAO.listarConInventario();
     }
     
    public boolean verificarRegistroPorId(int id){
        return inventarioDAO.verificarRegistroPorId(id);
    }
    
    public boolean  sacarProductos(int id,int cantidadsacar){
       return inventarioDAO.sacarProductos(id, cantidadsacar);
    }
 
}
