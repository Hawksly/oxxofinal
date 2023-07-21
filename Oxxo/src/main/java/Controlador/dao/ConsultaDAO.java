package Controlador.dao;

import Controlador.entity.Consulta;
import Controlador.jpa.ConsultaJpaController;

public class ConsultaDAO {
    private ConsultaJpaController ujpac = new ConsultaJpaController();
    private Consulta consulta = new Consulta();
    private String mensaje = "";
    
    public String insertarConsulta(String motivo, String nombre, String apellido, String correo, 
            int telefono, String tienda, String comentario){
        try {
            consulta.setMotivo(motivo);
            consulta.setClienteNombre(nombre);
            consulta.setClienteApellido(apellido);
            consulta.setClienteCorreo(comentario);
            consulta.setClienteTelefono(telefono);
            consulta.setTienda(tienda);
            consulta.setComentario(comentario);
            ujpac.create(consulta);
            mensaje = "Inserción correcta.";
        } catch (Exception e) {
            System.out.println("Mensaje en insertarUsuario: "+e.getMessage());
            mensaje = "No se pudo insertar la información.";
        }
        return null;
    }
    
    public String actualizarConsulta(){
        return null;
    }
    
    public String eliminarConsulta(){
        return null;
    }
}
