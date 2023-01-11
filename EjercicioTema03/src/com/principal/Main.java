//En la clase main se imprime valor de "funcioncita"

//Luego se getea y setea el objeto autito de la clase coche y se imprime por pantalla

//11/1/2023 04:15



package com.principal;

public class Main {
    public static void main(String[] args) {

//===============retorno ejercicio 3.1================

        funcionsita(1,2,3);

//=================================================

//======================RETORNO EJERCICIO 3.2===========================

        Coche miCoche = new Coche();

        System.out.println( miCoche.getNumeroPuertas());
        miCoche.setIncrementarPuertas();
        System.out.println(miCoche.getNumeroPuertas());

//============================================================

    }


//===============================ejercicio 3.1==========================================
    public static void funcionsita (int n1,int n2,int n3){
        System.out.println(n1+n2+n3);

    }
//=========================================================================

}