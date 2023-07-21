package Controlador.jpa.test;

import Controlador.dao.UsuarioDAO;

public class usuarioTest {
    
    public static void main (String[] args){
        UsuarioDAO udao = new UsuarioDAO();
        udao.insertarUsuario("Miguel Alonso", "Guillen", "Medina", 912350214, 
                "miguelguillen24mg@gmail.com", "Calle Libertad 149", 
                "fc61c9139bb3e2d090ebb9dba20953f3", "34c1c52729f1daae55392c8bb123b795",
                "Administrador");
    }
}
