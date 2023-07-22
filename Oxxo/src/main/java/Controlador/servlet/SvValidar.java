package Controlador.servlet;

import Controlador.dao.EmpleadoDAO;
import Modelo.entidades.Empleado;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SvValidar extends HttpServlet {

    EmpleadoDAO edao = new EmpleadoDAO();
    Empleado em = new Empleado();
    
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
        String accion = request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            em = edao.validar(user, pass);
            if (em.getUsuario()!=null) {
                request.getRequestDispatcher("Controlador.servlet?accion=Principal").forward(request, response);
            } else {
                request.getRequestDispatcher("/Vista/inicio.php").forward(request, response);
            }
        }else{
            request.getRequestDispatcher("/Vista/inicio.php").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
