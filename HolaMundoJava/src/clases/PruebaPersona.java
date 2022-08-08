/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author LibrePago-02
 */
public class PruebaPersona {

    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Angel";
        persona1.apellido = "Travieso";
        persona1.desplegarInformacion();
        
        
        Persona persona2 = new Persona();
        
        // System.out.println("persona1 = " + persona1);
        
        // paquete.clase.referencia_memoria
        // clases.Persona@682a0b20
       //  System.out.println("persona2 = " + persona2);
        
        
        // Cada uno de los objetos mantiene sus datos
        
        // Devuelve null, ya que no se ha pasado los valores que toma ese método para imprimir
        // null = ausencia de valor / no existe
        // persona2.desplegarInformacion();
        
        persona2.nombre = "Gustavo";
        persona2.apellido = "Castro";
        persona2.desplegarInformacion();
        
        
    }

}
