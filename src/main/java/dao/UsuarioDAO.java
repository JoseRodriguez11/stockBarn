
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;


public class UsuarioDAO {
    final private Connection con;
    private int idUsuario;
    private String rol;
    java.sql.Date sqlDate;
    
    
    public UsuarioDAO(Connection con){
        this.con=con;
    }
    
    
    /**
     * Guarda un nuevo registro de usuario en la base de datos.
     *
     * @param usuario El objeto Usuario que se va a guardar.
    */
    public void guardarUsuario(Usuario usuario){
        try {
            final String query = "INSERT INTO usuarios (nombres, apellidos, direccion, fechaNacimiento, compania, rol, correo, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?,MD5(?))";
            try (PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                registroUsuario(usuario, statement);
                statement.execute();
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idUsuario = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en el envio: ");
            throw new RuntimeException(ex);
        }
    }
    
    
     /**
     * Registra los detalles del usuario en el PreparedStatement dado.
     *
     * @param usuario   El objeto Usuario que contiene los detalles a registrar.
     * @param statement El PreparedStatement donde se registrarán los detalles.
     * @throws SQLException Si hay un error al acceder a la base de datos.
     */
    public void registroUsuario(Usuario usuario, PreparedStatement statement) throws SQLException{
        statement.setString(1, usuario.getNombres());
        statement.setString(2, usuario.getApellidos());
        statement.setString(3, usuario.getDireccion());
        //Convertir utilDate a sqlDate
        sqlDate = new java.sql.Date(usuario.getFechaNacimiento().getYear(), usuario.getFechaNacimiento().getMonth(), usuario.getFechaNacimiento().getDay());
        statement.setDate(4, sqlDate);
        statement.setString(5, usuario.getCompania());
        statement.setString(6, usuario.getRol());
        statement.setString(7, usuario.getCorreo());
        statement.setString(8, usuario.getContrasena());
    }
    public int getIdGenerado() {
        return idUsuario;
    }
    
    
    
     /**
     * Valida las credenciales de inicio de sesión del usuario.
     *
     * @param correo    El correo electrónico del usuario.
     * @param contrasena    La contraseña del usuario.
     * @return true si las credenciales son válidas, de lo contrario false.
     */
    public boolean validarUsuario(String correo, String contrasena){
        String sql = "SELECT COUNT(*) AS EXISTE_USUARIO "+"FROM usuarios "+"WHERE CORREO = ? AND CONTRASENA = MD5(?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, correo);
            statement.setString(2, contrasena);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getInt("EXISTE_USUARIO") > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
     /**
     * Verifica si un usuario ya está registrado en la base de datos.
     *
     * @param usuario El usuario para verificar su existencia en la base de datos.
     * @return true si el usuario ya existe en la base de datos, de lo contrario false.
     */
    public boolean verificarUsuario(Usuario usuario) {
        String sql = "SELECT COUNT(*) AS EXISTE_USUARIO "+"FROM usuarios "+"WHERE CORREO = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, usuario.getCorreo());
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getInt("EXISTE_USUARIO") > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
     /**
     * Busca el rol de un usuario en la base de datos.
     *
     * @param correo El correo electrónico del usuario.
     * @return El rol del usuario.
     */
    public String buscarRol(String correo){
        String sql = "SELECT * FROM usuarios WHERE CORREO = ?";
        ResultSet encontrado;
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, correo);
            encontrado = statement.executeQuery();
            if(encontrado.next()){
                rol = encontrado.getString("ROL");   
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rol;
    }
    
 
    
}
