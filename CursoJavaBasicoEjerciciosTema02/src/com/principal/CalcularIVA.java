package com.principal;

public class CalcularIVA {

    final int IVA=21;
    double precioProducto;


    CalcularIVA(){


    }

    public void setPrecioProducto(double precioProducto){
        this.precioProducto = precioProducto;

    }

    public double getIVAProducto(){

        return precioProducto * IVA / 100;

    }

    public double RetornarPrecioTOTAL(){
        return  ((precioProducto * IVA / 100) + precioProducto);
    }

}
