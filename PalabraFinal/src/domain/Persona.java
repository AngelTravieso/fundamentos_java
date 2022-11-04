package domain;

public final class Persona {
     
    // Si no se agrega constructor se llama el constructor default
    
    // constante en java, public para acceder y final static para que no cambie
    // las constantes deben ser en mayusculas (por estandard)
    public final static int MI_CONSTANTE = 1;
    
    private String nombre;
    
    
    
    public final void imprimir() {
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
