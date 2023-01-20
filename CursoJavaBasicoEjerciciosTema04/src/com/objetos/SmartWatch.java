package com.objetos;

import java.util.Date;

public class SmartWatch extends SmartDevice {

    Date hora;

    boolean bateria = true;

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public boolean isBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    boolean pantalla = true;

    public SmartWatch() {
    }

    public SmartWatch(Boolean conexionWifi, Boolean conexionBt, String procesador, double voltaje, double memoriaRam, double memoriaRom, Date hora, boolean bateria, boolean pantalla) {
        super(conexionWifi, conexionBt, procesador, voltaje, memoriaRam, memoriaRom);
        this.hora = hora;
        this.bateria = bateria;
        this.pantalla = pantalla;
    }
}
