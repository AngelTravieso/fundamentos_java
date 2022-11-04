package test;

import domain.Persona;

public class TestFinal {
    
    /*
        final
    variables: Evita cambiar el valor que almacena la variable
    metodos: Evita que se modifique la definicion de un metodo desde una subclase (overriting)
    clases: Evita que se cree una subclase (instanciar)
    */
    
    
    public static void main(String[] args) {
        // final = no deja cambiar el valor de la variable
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
//        Persona.MI_CONSTANTE = 5;

        System.out.println("Mi Constante = " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        
        // No se puede volver asignar una referencia a la variable, porque es final
        // pero si se puede modificar su contenido
//        persona1 = new Persona();

        // pero si se puede modificar por getters
        persona1.setNombre("Angel");
        
        System.out.println("persona1 nombre: " + persona1.getNombre());
        
        persona1.setNombre("Gustavo");
        
        System.out.println("persona1 nombre: " + persona1.getNombre());
        
    }
}
