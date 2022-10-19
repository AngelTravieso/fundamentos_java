/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrathis;

/**
 *
 * @author LibrePago-02
 */
public class PalabraThis {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);
    }
}

// Si se omite el modificador de acceso se le conocerá como "default" o "package"
// Significa que esta clase solamente se podrá ver desde otras clases definidas dentro del mismo paquete

class Persona {
    
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido) {
        //super(); llamada al constructor de la clase padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    
    public Imprimir() {
        super(); // el constructor de la clase object (padre) para reservar memoria
    }
    
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("impresion del objeto actual(this): " + this);
    }
    
}
