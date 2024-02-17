
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;



public class RegistroProductosSacadosDAO {
    
    final private Connection con;//conecxion con la base de datos 


    public RegistroProductosSacadosDAO(Connection con) {
        this.con = con;
    }     
    
    
       /**
     * Calcula la cantidad total de un producto sacado durante un período de tiempo específico.
     *
     * @param id           El ID del producto.
     * @param fechaInicio  La fecha de inicio del período.
     * @param fechaFinal   La fecha de finalización del período.
     * @return La cantidad total del producto sacado durante el período especificado.
     */
    public  int cantidadProductoSacadoPorSemana(int id,LocalDate fechaInicio,LocalDate fechaFinal) {
       int suma=0;
        try (PreparedStatement statement = con.prepareStatement(
            "SELECT WEEK(fecha) AS semana, SUM(cantidad_sacada) AS suma "
            + "FROM PRODUCTOS_SACADOS "
            + "WHERE fecha BETWEEN ? AND ? AND PRODUCTOID = ? "
            + "GROUP BY WEEK(fecha)")) {
            
            java.sql.Date fechaInicioSql = java.sql.Date.valueOf(fechaInicio);
            java.sql.Date fechaFinSql = java.sql.Date.valueOf(fechaFinal);
            
            statement.setDate(1, fechaInicioSql);
            statement.setDate(2, fechaFinSql);
            statement.setInt(3, id);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    
                     suma += resultSet.getInt("suma");
                   
                }
                
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return suma;
    }
    
    
}
