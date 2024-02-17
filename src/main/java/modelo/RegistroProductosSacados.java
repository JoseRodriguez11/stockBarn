
package modelo;

import java.time.LocalDate;


public class RegistroProductosSacados {
    private int id;
    private int cantidadSacada;
    private int productoId;
    private int fecha;

    public RegistroProductosSacados(int cantidadSacada, int productoId, int fecha) {
        this.cantidadSacada = cantidadSacada;
        this.productoId = productoId;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadSacada() {
        return cantidadSacada;
    }

    public void setCantidadSacada(int cantidadSacada) {
        this.cantidadSacada = cantidadSacada;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
}
