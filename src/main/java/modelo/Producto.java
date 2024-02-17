
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Producto {
    
    private int id;
    private String nombreProducto;
    private String provedor;
    private String marca ;
    private String numeroLote;
    private String presentacion;
    private String descripcion;
    private boolean disponibilidad;
    private String categoria;
    private List<Inventario> inventarios;
    
    public Producto(String nombreProducto, String presentacion, String categoria, String marca,String provedor, String numeroLote, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.categoria = categoria;
        this.marca = marca;
        this.provedor = provedor;
        this.numeroLote = numeroLote;
        this.descripcion = descripcion;
    }
    
    
    public Producto(int id, String nombreProducto, String presentacion, String categoria, String marca,String provedor, String numeroLote, String descripcion) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.presentacion = presentacion;
        this.categoria = categoria;
        this.marca = marca;
        this.provedor = provedor;
        this.numeroLote = numeroLote;
        this.descripcion = descripcion;
        
    }
    
    

    public void agregar(Inventario inventario){
        if(this.inventarios==null){
            this.inventarios=new ArrayList<>();
        }
        this.inventarios.add(inventario);
    }

    public int getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    

    @Override
    public String toString() {
        return String.format(
        "{id: %d, nombreProducto: %s, presentacion: %s categoria: %s, marca: %s, provedor: %s, lote: %s, descripcion: %s}",
                this.id,
                this.nombreProducto,
                this.presentacion,
                this.categoria,
                this.marca,
                this.provedor,
                this.numeroLote,
                this.descripcion
                
                );
    }
    
    

  
    
    
    
}
