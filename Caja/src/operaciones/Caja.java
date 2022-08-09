/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author LibrePago-02
 */
public class Caja {
    
    int alto;
    int ancho;
    int profundo;
    int volumen;
    
    public Caja() {
        System.out.println("Constructor vacio");
    }
    
    public Caja(int alto, int ancho, int prof) {
        
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = prof;
        
    }
    
    public void calcularVolumen() {
        
        this.volumen = this.ancho * this.alto * this.profundo;
        System.out.println("volumen = " + volumen);
        
    }
    
}
