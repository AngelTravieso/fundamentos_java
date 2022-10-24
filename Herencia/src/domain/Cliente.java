package domain;

import java.util.Date;

public class Cliente extends Persona {
    
    private int idCliente;
    private Date fechaRegistro;
    private static int contadorCliente;
    private boolean vip;
    
    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = Cliente.contadorCliente++;
        this.fechaRegistro = new Date();
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

}
