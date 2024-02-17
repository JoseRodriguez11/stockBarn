
package modelo;

public enum Categoria {
    
    Acuicultura("Acuicultura"),
    Avicultura("Avicultura"),
    Equinos("Equinos"),
    Ganaderia("Ganaderia"),
    Mascotas("Mascotas");
    
    private String categoriaProductos;

    private Categoria(String catego) {
        this.categoriaProductos = catego;
    }

    public String getCategoriaProductos() {
        return categoriaProductos;
    }

    public void setCategoriaProductos(String categoriaProductos) {
        this.categoriaProductos = categoriaProductos;
    }
     
    
}
