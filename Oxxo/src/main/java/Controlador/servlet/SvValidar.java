package Controlador.servlet;

import Controlador.dao.EmpleadoDAO;
import Modelo.encriptacion.Encriptacion;
import Modelo.entidades.Empleado;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvValidar", urlPatterns = {"/SvValidar"})
public class SvValidar extends HttpServlet {

    EmpleadoDAO edao = new EmpleadoDAO();
    Empleado em = new Empleado();
    Encriptacion encript = new Encriptacion();
    
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
        try {
            String accion = request.getParameter("accion");
            if(accion.equalsIgnoreCase("Ingresar")){
            String user = request.getParameter("username");
            String password = request.getParameter("password");
            String pass = encript.encriptar(password);
            if (edao.validar(user, pass) == true) {
                request.getRequestDispatcher("/Vista/inventario.jsp").forward(request, response);
            }else{
            request.getRequestDispatcher("/Vista/login.jsp").forward(request, response);
            }
            }
        } catch (IOException | ServletException e) {
            System.out.println("Error en SvValidar: "+e);
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
