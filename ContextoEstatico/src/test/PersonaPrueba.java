package test;

import domain.Persona;

public class PersonaPrueba {
    
    private int contador;
       
    // Para llamar un metodo estatico en un contexto estático debe declararse el método como estatico
    // No se puede usar this dentro de un contexto estático
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        imprimir(persona1);
        
        Persona persona2 = new Persona("Karla");
        imprimir(persona2);
        
        //this.contador = 10;
        
    }
    
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
    
    public int getContador() {
        imprimir(new Persona("Pedro"));
        return this.contador;
    }
    
}
