
package modelo;

import java.util.Date;


public class Usuario {
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date fechaNacimiento;
    private String compania;
    private String rol;
    private String correo;
    private String contrasena;
    private boolean estado; // este atributo me indica el estado del trabajador activo o desactivo 
    public Usuario(String nombres, String apellidos, String direccion, Date fechaNacimmiento, String compania, String rol, String correo, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimmiento;
        this.compania = compania;
        this.rol = rol;
        this.correo = correo;
        this.contrasena = contrasena;
    }
    
    public Usuario(String rol){
        this.rol=rol;
    }
    public int getId() {
        return id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimmiento(Date fechaNacimmiento) {
        this.fechaNacimiento = fechaNacimmiento;
    }
    public String getCompania() {
        return compania;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
