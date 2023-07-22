package Controlador.dao;

import Modelo.entidades.Empleado;
import Modelo.DataBase.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public Empleado validar(String user, String password){
        Empleado em = new Empleado();
        String sql="SELECT * FROM empleado WHERE usuario=? and contrasena=?";
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while (rs.next()) {
                em.setIdUsuario(rs.getInt("IdEmpleado"));
                em.setDni(Integer.parseInt("Dni"));
                em.setApellidoPaterno("ApellidoPaterno");
                em.setApellidoMaterno("ApellidoMaterno");
                em.setTelefono(Integer.parseInt("Telefono"));
                em.setCorreo("Correo");
                em.setDireccion("Direccion");
                em.setUsuario(rs.getString("User"));
                em.setContrasena("Pass");
                em.setRol("Rol");
                
            }
        } catch (SQLException e) {
        }
        return em;
    }
    
}
