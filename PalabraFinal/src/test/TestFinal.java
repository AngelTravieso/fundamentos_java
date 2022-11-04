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
    }
}
