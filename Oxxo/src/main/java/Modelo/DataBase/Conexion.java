package Modelo.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/oxxo";
    String user = "root";
    String password = "";
    Connection con;
    
    public Connection conexion(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en conexion(): "+e);
        }
        return con;
    }
}
