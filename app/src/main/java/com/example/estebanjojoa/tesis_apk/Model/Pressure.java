package com.example.estebanjojoa.tesis_apk.Model;

public class Pressure {
    private int sistolica;
    private int diastolica;
    private String fecha;
    private boolean estado;
    public Pressure(int sistolica, int diastolica, String fecha, boolean estado) {
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getSistolica() {
        return sistolica;
    }

    public void setSistolica(int sistolica) {
        this.sistolica = sistolica;
    }

    public int getDiastolica() {
        return diastolica;
    }

    public void setDiastolica(int diastolica) {
        this.diastolica = diastolica;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
