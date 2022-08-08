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
    
    // los primitivos numericos tienen como valor default 0
    int a;
    int b;
    
    
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
    
    
    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        // return a + b;
        return sumarConRetorno();
    }
    
    
    
    
}
