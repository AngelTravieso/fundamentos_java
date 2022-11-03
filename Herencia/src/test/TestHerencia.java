package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);

        // new Date: genera un objeto Date con la fecha actual
        var fecha = new Date();
            
//        Cliente cliente1 = new Cliente(
//                fecha, true, "Karla", 'F', 28, "Saturno");
//        
////        System.out.println("cliente1 = " + cliente1);
//
//           Persona persona = new Persona();

        

    }
}
