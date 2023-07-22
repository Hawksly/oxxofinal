package Controlador.dao;

import Modelo.entidades.Empleado;
import Modelo.DataBase.Conexion;
import Modelo.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Rol r = new Rol();
    public String roles ="";
    public boolean validar(String user, String password) {
    String sql = "SELECT * FROM empleado WHERE usuario=? AND contrasena=?";
    try {
        con = cn.conexion();
        ps = con.prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, password);
        rs = ps.executeQuery();
        if (rs.next()) {
            Empleado em = new Empleado();
            em.setUsuario(rs.getString("usuario"));
            em.setContrasena(rs.getString("contrasena"));
            em.setRol(rs.getString("rol"));
            r.setRol(rs.getString("rol"));
            roles = r.getRol();
            String usuarioDB = em.getUsuario();
            if (usuarioDB != null && usuarioDB.equalsIgnoreCase(user)) {
                System.out.println("Usuario autenticado: " + usuarioDB);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    } catch (SQLException e) {
        System.out.println("Error en validar(): " + e);
        return false;
    }
    
}

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    
}
