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
    
    
    // Sobrecarga de constructores, es cuando se tiene mas de un constructor
    
    // Constructor vacio
    public  Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    // Constructor con argumentos
    public Aritmetica(int a, int b) {
        System.out.println("Ejecutando contructor con argumentos");
        this.a = a;
        this.b = b;
        
    }
    
    
    // Metodo
    public void sumar() {
        int resultado = this.a + this.b ;
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
