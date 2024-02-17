
package factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.*;


/**
 * La clase ConexionFactory proporciona una fábrica de conexiones Singleton
 * que utiliza un pool de conexiones (ComboPooledDataSource) para gestionar
 * las conexiones a una base de datos MySQL.
 */
public class ConexionFactory {
    
    private static ConexionFactory instance;
    private ComboPooledDataSource datasource;
    //private DataSource datasource;
    private static final String URL="jdbc:mysql://localhost/stockBarn";
    private static final String USER="root";
    
    private static final String PASSWORD=""; //escriba qui la contraseña de mysql 
    
     /**
     * Constructor privado para evitar la creación de instancias fuera de la clase.
     */
    
    public ConexionFactory(){
        var pooledDataSource=new ComboPooledDataSource();
        pooledDataSource.setJdbcUrl(URL);
        pooledDataSource.setUser(USER);
        pooledDataSource.setPassword(PASSWORD);
        pooledDataSource.setInitialPoolSize(15);
        pooledDataSource.setMaxPoolSize(50);
        this.datasource=pooledDataSource;
    }
    
     /**
     * Método estático para obtener la instancia única de ConexionFactory.
     *
     * @return La instancia única de ConexionFactory.
     */
    public static ConexionFactory getInstance() {
        if (instance == null) {
            instance = new ConexionFactory();
        }
        return instance;
    }
    
    /**
     * Devuelve una conexión a la base de datos utilizando el pool de conexiones.
     *
     * @return Una conexión a la base de datos.
     * @throws RuntimeException Si se produce un error al obtener la conexión.
     */
    
    
    public Connection conexion() {
        try {
            return this.datasource.getConnection();
        } catch (SQLException ex) {
           throw new RuntimeException();
        }
    }
     
   
            
}
