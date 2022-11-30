package com.mundopc;


public class Monitor {
    
    private int idMonitor;
    private String marca;
    private double size;
    private int contadorMonitores;


    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }


    public Monitor(String marca, double size) {
        this.marca = marca;
        this.size = size;
    }


    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", size=" + size + ", contadorMonitores=" + contadorMonitores + '}';
    }

}
