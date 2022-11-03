package domain;

public class Empleado extends Persona {
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        // Llamar constructor de la clase padre
//        super(nombre);
        // debe ser la primera linea
        this(); // llamar a un constructor interno
        // Llamar propiedades de la clase padre sin super
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        return sb.toString();
    }
  
}
