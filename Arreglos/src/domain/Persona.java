package domain;

// Todas las clases de manera implicita hereda de la clase Object
public class Persona {
    
    private String nombre;
    
   public Persona(String nombre) {
       this.nombre = nombre;
   }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * El metodo toString() de la clase Object imprime la direción
     * en memorio del objeto
     */

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "}" + ", " + super.toString();
    }
}
