
package Controlador;

import Modelo.DataBase.DataBase;
import java.sql.Connection;
import java.sql.SQLException;

public class CRUD {
    DataBase db = new DataBase();
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            db.setUrl("jdbc:mysql://localhost:3306/oxxo");
            db.setUsername("root");
            db.setPassword("");
            return db.getConn(db.getUrl(), db.getUsername(), db.getPassword());
        } catch (Exception e) {
            System.out.println("Error al conectar "+e);
            return null;
        }
    }
    
    public void Desconectar() throws SQLException{
        try {
            db.getConn(db.getUrl(), db.getUsername(), db.getPassword()).close();
        } catch (Exception e) {
            System.out.println("Error en Desconectar: "+e);
        }
    }
    
    public void Insertar(){
        
    }
    
    public void Eliminar(){
        
    }
}
