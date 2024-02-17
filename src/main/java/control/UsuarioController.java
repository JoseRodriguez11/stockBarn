
package control;

import dao.UsuarioDAO;
import factory.ConexionFactory;
import modelo.Usuario;


public class UsuarioController {
    private final UsuarioDAO usuarioDAO;
    
    public UsuarioController(){
        this.usuarioDAO=new UsuarioDAO(new ConexionFactory().conexion());
    }
  
    public void guardarRegistro(Usuario usuario){
        usuarioDAO.guardarUsuario(usuario);
    }
    public boolean validarUsuario(String correo, String contrasena){
        return usuarioDAO.validarUsuario(correo,contrasena);
    }
    public boolean verificarRegistro(Usuario producto){
        return usuarioDAO.verificarUsuario(producto);
    }
    public String buscarRol(String correo){
        return usuarioDAO.buscarRol(correo);
    }

    
}
