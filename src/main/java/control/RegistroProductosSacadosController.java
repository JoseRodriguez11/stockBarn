
package control;

import dao.RegistroProductosSacadosDAO;
import factory.ConexionFactory;
import java.time.LocalDate;


public class RegistroProductosSacadosController {
    
    private static ConexionFactory factory = ConexionFactory.getInstance();
    private RegistroProductosSacadosDAO registroproductosacadosDAO;
    
   
   
    public RegistroProductosSacadosController(){
        this.registroproductosacadosDAO=new RegistroProductosSacadosDAO(factory.conexion());
    }
    
    public int cantidadProductoSacadoPorSemana(int id,LocalDate fechaInicio,LocalDate fechaFinal){
        return registroproductosacadosDAO.cantidadProductoSacadoPorSemana(id, fechaInicio, fechaFinal);
    }
}
