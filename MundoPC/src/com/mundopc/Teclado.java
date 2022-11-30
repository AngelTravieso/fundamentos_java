package com.mundopc;


public class Teclado {

    private int idTeclado;
    private int contadorTeclados;
    

    public Teclado() {
        this.idTeclado = ++contadorTeclados;
    }


    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }
    
}
