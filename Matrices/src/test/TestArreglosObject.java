package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        // arreglo de tipo Object
         Persona personas[] = new Persona[2];
         
         personas[0] = new Persona("Angel");
         personas[1] = new Persona("Gustavo");
         
//         System.out.println("personas 0 = " + personas[0]);
//         System.out.println("personas 1 = " + personas[1]);
         
        // iterar los elementos de un arreglo de tipo Object
         for(int i = 0; i < personas.length; i++) {
             System.out.println(String.format("Personas = %s", personas[i]));
        }

    }
}
