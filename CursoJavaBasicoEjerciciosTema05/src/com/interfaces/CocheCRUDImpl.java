package com.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<CocheCRUDImpl> coches =new ArrayList<>();

    int modelo;
    String Marca;
    double cilindrada;

    public CocheCRUDImpl() {
    }

    public CocheCRUDImpl(int modelo, String marca, double cilindrada) {
        this.modelo = modelo;
        Marca = marca;
        this.cilindrada = cilindrada;
    }

    @Override
    public List<CocheCRUDImpl> findAll() {
        return coches;
    }

    @Override
    public void save(CocheCRUDImpl coche) {
        coches.add(coche);
    }

    @Override
    public void delete(CocheCRUDImpl coche) {
        coches.remove(coche);
    }


    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "coches=" + coches +
                ", modelo=" + modelo +
                ", Marca='" + Marca + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
