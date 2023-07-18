package Controlador.dao;

import Controlador.entity.Usuario;
import Controlador.jpa.UsuarioJpaController;

public class UsuarioDAO {
    private UsuarioJpaController ujpac = new UsuarioJpaController();
    private Usuario usuario = new Usuario();
    private String mensaje = "";
    
    public String insertarUsuario(String nombre, String apellidoPaterno, String apellidoMaterno, 
            int telefono, String correo, String direccion, String user, String contrasena, String rol){
        try {
            usuario.setIdUsuario(Integer.MIN_VALUE);
            usuario.setNombre(nombre);
            usuario.setApellidoPaterno(apellidoPaterno);
            usuario.setApellidoMaterno(apellidoMaterno);
            usuario.setTelefono(telefono);
            usuario.setCorreo(correo);
            usuario.setDireccion(direccion);
            usuario.setUsuario(user);
            usuario.setContrasena(contrasena);
            usuario.setRol(rol);
            ujpac.create(usuario);
            mensaje = "Inserción correcta.";
        } catch (Exception e) {
            System.out.println("Mensaje en insertarUsuario: "+e.getMessage());
            mensaje = "No se pudo insertar la información.";
        }
        return null;
    }
    
    public String actualizarUsuario(){
        return null;
    }
    
    public String eliminarPersona(){
        return null;
    }
}
