/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author LibrePago-02
 */
public class Aritmetica {
    
    // Atributos de la clase
    int a; // los primitivos numericos tienen como valor default 0
    int b;
    
    
    // Constructor vacio
    public  Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    
    
    // Metodo
    public void sumar() {
        int resultado = a + b ;
        System.out.println("resultado = " + resultado);
    }
    
    
    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }
    
    
    public int sumarConArgumentos(int a, int b) {
        // El argumento "a" se asigna al atributo "this.a"
        this.a = a;
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
    }
    
    
    
    
}
