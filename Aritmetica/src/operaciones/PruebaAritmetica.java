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
        
        // Instanciar clase
        Aritmetica aritmetica1 = new Aritmetica();
        
        // Setear valor de atributos
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        
        // Llamar metodo
        aritmetica1.sumar();
        
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        
    }
    
}
