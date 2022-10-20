package test;
import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
         Persona persona1 = new Persona("Juan", 5000.00, false);
           
         System.out.println("persona1: " + persona1.toString());
         
         System.out.println("persona1 nombre: " + persona1.getNombre());
         persona1.setNombre("Carlos");
         // persona1.nombre = "Carlos";
         // System.out.println("nombre:" + persona1.nombre);
         
         System.out.println("persona1 nombre con cambio: " + persona1.getNombre());
         System.out.println("persona1 sueldo: " + persona1.getSueldo());
         System.out.println("persona1 eliminado: " + persona1.isEliminado());
         
         Persona persona2 = new Persona("Angel", 625, false);
         persona2.setNombre("Gustavo");
         persona2.setSueldo(1500);
         persona2.setEliminado(true);
         
         System.out.println("persona2 = " + persona2.getNombre());
         System.out.println("persona2 = " + persona2.getSueldo());
         System.out.println("persona2 = " + persona2.isEliminado());

        /*  
            El metodo printLn manda a llamar
            de manera automatica el metodo toString
        */
        
        System.out.println("persona1: " + persona1);
         
         

    }
}
