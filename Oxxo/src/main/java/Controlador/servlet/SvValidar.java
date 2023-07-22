package Controlador.servlet;

import Controlador.dao.EmpleadoDAO;
import Modelo.entidades.Empleado;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvValidar", urlPatterns = {"/SvValidar"})
public class SvValidar extends HttpServlet {

    EmpleadoDAO edao = new EmpleadoDAO();
    Empleado em = new Empleado();
    
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
        String accion = request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            em = edao.validar(user, pass);
            if (em.getUsuario()!=null) {
                request.getRequestDispatcher("SvControlador?accion=Inicio").forward(request, response);
            } else {
                request.getRequestDispatcher("/Vista/login.jsp").forward(request, response);
            }
        }else{
            request.getRequestDispatcher("/Vista/login.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
