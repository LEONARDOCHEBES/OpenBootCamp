package com.objetos;

public class SmartPhone extends SmartDevice {
    String[] agenda = {"numero 1", "numero 2"};
    boolean marcar = true;
    boolean colgar = true;
    boolean videollamada = true;

    public SmartPhone() {

    }

    public SmartPhone(Boolean conexionWifi, Boolean conexionBt, String procesador, double voltaje, double memoriaRam, double memoriaRom, String[] agenda, boolean marcar, boolean colgar, boolean videollamada) {
        super(conexionWifi, conexionBt, procesador, voltaje, memoriaRam, memoriaRom);
        this.agenda = agenda;
        this.marcar = marcar;
        this.colgar = colgar;
        this.videollamada = videollamada;
    }

    public String[] getAgenda() {
        return agenda;
    }

    public void setAgenda(String[] agenda) {
        this.agenda = agenda;
    }

    public boolean isMarcar() {
        return marcar;
    }

    public void setMarcar(boolean marcar) {
        this.marcar = marcar;
    }

    public boolean isColgar() {
        return colgar;
    }

    public void setColgar(boolean colgar) {
        this.colgar = colgar;
    }

    public boolean isVideollamada() {
        return videollamada;
    }

    public void setVideollamada(boolean videollamada) {
        this.videollamada = videollamada;
    }


}
