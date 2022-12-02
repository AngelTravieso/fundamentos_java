package com.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double size;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double size) {
        this(); // llamar constructor vacio
        this.marca = marca;
        this.size = size;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int aContadorMonitores) {
        contadorMonitores = aContadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", size=" + size + ", contadorMonitores=" + contadorMonitores + '}';
    }

}
