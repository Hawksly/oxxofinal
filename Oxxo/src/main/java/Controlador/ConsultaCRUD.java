package Controlador;

import Controlador.dao.ConsultaDAO;
import Controlador.entity.Consulta;
import Controlador.jpa.ConsultaJpaController;
import java.sql.SQLException;

public class ConsultaCRUD extends Modelo.DataBase.ConneccionDB{
    
    public void Insertar() throws SQLException{
        Conectar();
        Consulta con = new Consulta();
        ConsultaDAO cdao = new ConsultaDAO();
        ConsultaJpaController cjpa = new ConsultaJpaController();
        cjpa.create(con);
        Desconectar();
    }
    
    public void Eliminar(){
        
    }
}
