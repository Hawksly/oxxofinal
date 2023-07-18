package Controlador.servlet;

import Controlador.dao.ProductoDAO;
import Modelo.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(name = "SvProducto", urlPatterns = {"/SvProducto"})
public class SvProducto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, javax.servlet.ServletException {
        String accion = request.getParameter("accion");
        Producto p = new Producto();
        ProductoDAO  pdao = new ProductoDAO();
        switch (accion) {
            case "Guardar":
                ArrayList<String>lista = new ArrayList<>();
                try {
                    FileItemFactory file = new DiskFileItemFactory();
                    ServletFileUpload fileUpload = new ServletFileUpload(file);
                    List items = fileUpload.parseRequest(request);
                    for (int i = 0; i < items.size(); i++) {
                        FileItem fileItem = (FileItem)items.get(i);
                        if (!fileItem.isFormField()) {
                            File f = new File("C:\\imagenes\\"+fileItem.getName());
                            fileItem.write(f);
                            p.setRuta(f.getAbsolutePath());
                        }else{
                            lista.add(fileItem.getString());
                        }
                        p.setNombre(lista.get(0));
                        pdao.insertarProducto("", "", 15.2, "", p.getRuta());
                    }
                } catch (Exception e) {
                }
            {
                try {
                    request.getRequestDispatcher("SvProducto?accion?Listar").forward(request, (ServletResponse) response);
                } catch (javax.servlet.ServletException ex) {
                    Logger.getLogger(SvProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case "Listar":
                request.getRequestDispatcher("Oxxo/Vista/inicio.php").forward(request, (ServletResponse) response);
                break;
            default:
                throw new AssertionError();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, javax.servlet.ServletException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
