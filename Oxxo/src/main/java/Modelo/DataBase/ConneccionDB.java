package Modelo.DataBase;

import java.sql.Connection;
import java.sql.SQLException;

public class ConneccionDB {
    DataBase db = new DataBase();
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            db.setUrl("jdbc:mysql://localhost:3306/oxxo");
            db.setUsername("root");
            db.setPassword("");
            return db.getConn(db.getUrl(), db.getUsername(), db.getPassword());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar "+e);
            return null;
        }
    }
    
    public void Desconectar() throws SQLException{
        try {
            db.getConn(db.getUrl(), db.getUsername(), db.getPassword()).close();
        } catch (SQLException e) {
            System.out.println("Error en Desconectar: "+e);
        }
    }
}
