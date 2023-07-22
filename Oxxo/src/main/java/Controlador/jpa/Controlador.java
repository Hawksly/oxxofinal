package Controlador.jpa;

import Modelo.entidades.Consulta;
import Modelo.entidades.Empleado;

public class Controlador {
    
    ConsultaJpaController cjpa = new ConsultaJpaController();
    EmpleadoJpaController ejpa = new EmpleadoJpaController();
    
    public void CrearConsulta(Consulta cons) {
        cjpa.create(cons);
    }
    
    public void CrearRegistro(Empleado emp){
        ejpa.create(emp);
    }

}
