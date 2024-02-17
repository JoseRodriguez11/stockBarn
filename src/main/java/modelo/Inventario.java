
package modelo;


import java.util.List;


public class Inventario {
    private int id;
    private int cantidadUnidades;
    private String estante;
    private int productoId;
    private int productos_sacados;
    
    
    public Inventario(String estante,int cantidadUnidades){
        this.estante=estante;
        this.cantidadUnidades=cantidadUnidades;
    }
    
    public Inventario(int id,int cantidadUnidades){
        this.id=id;
        this.cantidadUnidades=cantidadUnidades;
    }
    public Inventario(int id){
        this.id=id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getProductos_sacados() {
        return productos_sacados;
    }

    public void setProductos_sacados(int productos_sacados) {
        this.productos_sacados = productos_sacados;
    }
    
    @Override
    public String toString() {
        return String.format(
                "cantidad: %d, \t estante: %s",
                this.cantidadUnidades,
                this.estante
        );
    }

    
    
    
}
