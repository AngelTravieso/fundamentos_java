
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author LibrePago-02
 */
public class PasoPorReferencia {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Angel";
        
        System.out.println("persona1 nombre: " + persona1.nombre);
        
        persona1 = cambiarValor(persona1);
        
        System.out.println("persona1 nombre: " + persona1.nombre);
        
    }
    
    public static Persona cambiarValor(Persona persona) {
    
        if(persona == null) {
            System.out.println("valor de persona invalido: null");
            return persona;
        }
        
        persona.nombre = "Gustavo";
        
        return persona;
    }
    
    
    
}
