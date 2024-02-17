
package modelo;

import control.InventarioController;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import control.ProductoController;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

public class Tabla {
     private DefaultTableModel modelo=new DefaultTableModel();
     private ProductoController productocontroller=new ProductoController();
     private InventarioController inventariocontroller=new InventarioController();
    
    
    /**
     * Muestra los datos de inventario en una tabla.
     *
     * @param tabla La tabla donde se mostrarán los datos de inventario.
     */
     public void mostarTabla(JTable tabla){
        modelo = (DefaultTableModel) tabla.getModel();
        var contenido=inventariocontroller.listarConInventario();
        
        contenido.forEach(producto -> {
            var datosInventario=producto.getInventarios();
     
            datosInventario.forEach(inventario
                    -> modelo.addRow(new Object[]{
                        producto.getId(),
                        producto.getNombreProducto(),
                        producto.getPresentacion(),
                        producto.getCategoria(),
                        producto.getMarca(),
                        producto.getProvedor(),
                        producto.getNumeroLote(),
                        producto.getDescripcion(),
                        inventario.getCantidadUnidades(),
                        inventario.getEstante()

            }));
            
        });
        
    }
     
     
     /**
     * Busca productos en la tabla y los muestra según el término de búsqueda proporcionado.
     *
     * @param tabla          La tabla donde se mostrarán los productos encontrados.
     * @param buscarProducto El término de búsqueda para buscar productos.
     */
    public void buscarProducto(JTable tabla, JTextField buscarProducto){
        modelo = (DefaultTableModel) tabla.getModel();
        var productos = this.productocontroller.mostarPorBusqueda(buscarProducto.getText());
       
        //cambia de color la letra cuando la cantidad es menor de 20 
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                setForeground(Color.BLACK); 

                if (value instanceof Integer) {
                    int cantidad = (Integer) value;
                    if (cantidad < 20) {
                        setForeground(Color.RED); 
                    }
                }

                super.setValue(value);
            }
        };
        tabla.getColumnModel().getColumn(8).setCellRenderer(renderer);
        productos.forEach(producto -> {
            var datosInventario = producto.getInventarios();

            datosInventario.forEach(inventario
                    -> modelo.addRow(new Object[]{
                producto.getId(),
                producto.getNombreProducto(),
                producto.getPresentacion(),
                producto.getCategoria(),
                producto.getMarca(),
                producto.getProvedor(),
                producto.getNumeroLote(),
                producto.getDescripcion(),
                inventario.getCantidadUnidades(),
                inventario.getEstante()

            }));

        });

        
    }
    
    public void limpiarTabla(){
        modelo.getDataVector().clear();
    }

    
     /**
     * Obtiene el modelo de tabla actual.
     *
     * @return El modelo de tabla actual.
     */
    public DefaultTableModel getModelo() {
        return modelo;
    }
    
}
