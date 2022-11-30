package com.mundopc;


public class Raton {
    
    private int idRaton;
    private int contadorRatones;


    public Raton() {
        this.idRaton = ++contadorRatones;
    }


    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }

}
