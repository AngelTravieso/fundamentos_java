package dominio;

/*
private: la propiedad solo es accesible dentro de la clase
*/


public class Persona {
    
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    // método get para recuperar informacion
    public String getNombre() {
        return this.nombre;
    }
    
    // metodo set para setear (guardar) informacion
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    // Sueldo
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // Eliminado
    public boolean isEliminado() {
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString() {
        return "Persona [ nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado +
                " ]";
    }
    
}
