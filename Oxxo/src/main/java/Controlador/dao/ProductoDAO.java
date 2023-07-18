package Controlador.dao;

import Controlador.CRUD;
import Controlador.entity.Productos;
import Controlador.jpa.ProductosJpaController;

public class ProductoDAO {
    
    private ProductosJpaController ujpac = new ProductosJpaController();
    private Productos producto = new Productos();
    private String mensaje = "";
    
    public String insertarProducto(String nombre, String descripcion, Double precio, String categoria, String ruta){
        CRUD cn = new CRUD();
        try {
            producto.setIdProducto(Integer.MIN_VALUE);
            producto.setNombrePoducto(nombre);
            producto.setDescripcionProducto(descripcion);
            producto.setPrecioProducto(precio);
            producto.setCategoriaProducto(categoria);
            producto.setRutaProducto(ruta);
            ujpac.create(producto);
            mensaje = "Inserción correcta.";
        } catch (Exception e) {
            System.out.println("Mensaje en insertarProducto: "+e.getMessage());
            mensaje = "No se pudo insertar la información.";
        }
        return null;
    }
    
    public String actualizarProducto(){
        return null;
    }
    
    public String eliminarProducto(){
        return null;
    }
}

