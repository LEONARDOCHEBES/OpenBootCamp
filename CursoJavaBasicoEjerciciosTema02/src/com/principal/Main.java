package com.principal;

public class Main {
    public static void main(String[] args) {

        CalcularIVA calculo = new CalcularIVA();

        calculo.setPrecioProducto(100);

        System.out.println("El IVA del producto es: " + calculo.getIVAProducto()+ " %");

        System.out.println("El VALOR del producto es: " + (calculo.precioProducto)+" $");

        System.out.println("El TOTAL del producto es: " + (calculo.RetornarPrecioTOTAL())+" $");
    }

}