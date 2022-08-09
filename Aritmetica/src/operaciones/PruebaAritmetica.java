/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author LibrePago-02
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        // Variables locales
        int a = 10;
        int b = 2;
        
        miMetodo();
        
        // Instanciar clase
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a = " + aritmetica1.a);
        System.out.println("aritmetica1 b = " + aritmetica1.b);
        
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a = " + aritmetica2.a);
        System.out.println("aritmetica2 b = " + aritmetica2.b);
        
        // aritmetica1 = null;
        // System.gc();
        
    }
    
    
    public static void miMetodo() {
        // la variable "a" esta fuera del alcance de donde fue definida
        // a = 10;
        System.out.println("otro metodo");
    }
    
}
