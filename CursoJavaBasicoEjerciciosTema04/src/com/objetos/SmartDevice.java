package com.objetos;

import java.util.Date;

public class SmartDevice {
    protected Boolean ConexionWifi=true;
    Boolean ConexionBt=true;
    String Procesador;
    double voltaje;
    double memoriaRam;
    double memoriaRom;

    public SmartDevice(){}
    public SmartDevice(Boolean conexionWifi, Boolean conexionBt, String procesador, double voltaje, double memoriaRam, double memoriaRom) {
        ConexionWifi = conexionWifi;
        ConexionBt = conexionBt;
        Procesador = procesador;
        this.voltaje = voltaje;
        this.memoriaRam = memoriaRam;
        this.memoriaRom = memoriaRom;
    }

    public Boolean getConexionWifi() {
        return ConexionWifi;
    }

    public void setConexionWifi(Boolean conexionWifi) {
        ConexionWifi = conexionWifi;
    }

    public Boolean getConexionBt() {
        return ConexionBt;
    }

    public void setConexionBt(Boolean conexionBt) {
        ConexionBt = conexionBt;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getMemoriaRom() {
        return memoriaRom;
    }

    public void setMemoriaRom(double memoriaRom) {
        this.memoriaRom = memoriaRom;
    }


}

