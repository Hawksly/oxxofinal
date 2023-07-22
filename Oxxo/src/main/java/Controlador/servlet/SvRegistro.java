package Controlador.servlet;

import Controlador.jpa.Controlador;
import Modelo.encriptacion.Encriptacion;
import Modelo.entidades.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SvRegistro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String paterno = request.getParameter("paterno");
        String materno = request.getParameter("materno");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");
        String rol = request.getParameter("rol");
        Encriptacion encript = new Encriptacion();
        /*Impresión de mensajes*/
            System.out.println("dni: "+dni);
            System.out.println("nombre: "+nombre);
            System.out.println("paterno: "+paterno);
            System.out.println("materno: "+materno);
            System.out.println("telefono: "+telefono);
            System.out.println("correo: "+correo);
            System.out.println("direccion: "+direccion);
            System.out.println("usuario: "+usuario);
            System.out.println("contraseña: "+pass);
            System.out.println("Rol: "+rol);

        Controlador control = new Controlador();
        try {
            Empleado emp = new Empleado(Integer.parseInt(dni), nombre, paterno, materno, 
                    Integer.parseInt(telefono), correo, direccion, usuario, encript.encriptar(pass), rol);
            control.CrearRegistro(emp);
            response.sendRedirect("/Oxxo/Vista/login.jsp");
        } catch (IOException e) {
            response.sendRedirect("/Oxxo/Vista/registroempleado.jsp");
            System.out.println("Error en la verificación del registro: "+e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
