package Controlador.servlet;

import Controlador.jpa.Controlador;
import Modelo.entidades.Consulta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SvContacto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String motivo = request.getParameter("motivo");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String tienda = request.getParameter("tienda");
        String comentario = request.getParameter("mensaje");
        /*Impresión de mensajes*/
            System.out.println("motivo: "+motivo);
            System.out.println("nombre: "+nombre);
            System.out.println("apellido: "+apellido);
            System.out.println("correo: "+correo);
            System.out.println("telefono: "+telefono);
            System.out.println("tienda: "+tienda);
            System.out.println("comentario: "+comentario);
        /*Conexión a la base de datos*/
        Controlador control = new Controlador();
        try {
            Consulta cons = new Consulta(motivo, nombre, apellido, correo, 
                Integer.parseInt(telefono), tienda, comentario);
        control.CrearConsulta(cons);
            response.sendRedirect("/Oxxo/Vista/inicio.php");
        } catch (IOException e) {
            response.sendRedirect("/Oxxo/Vista/contacto.jsp");
            System.out.println("Error en la verificación del registro: "+e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
