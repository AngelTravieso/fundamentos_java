package com.mundopc;

public class DispositivoEntrada {

    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    public String getTipoEntrada() {
        return this.tipoEntrada;
    }
    
    public void setTipoEntrada(String entrada) {
        this.tipoEntrada = entrada;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }

}
