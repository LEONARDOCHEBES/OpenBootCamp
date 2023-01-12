public class Main {
    public static void main(String[] args) {

//==========================EJERCICIO 4.1==================================

        int numeroIf =4;

        System.out.println("EJERCICIO 4.1");

        if (   numeroIf == 0 ){
            System.out.println("Es igual a cero");
        } else if (  numeroIf > 0 ) {
            System.out.println("Variable numeroIf es positiva");
        } else if (numeroIf < 0) {
            System.out.println("Variable numeroIf es Negativa");
        }

//=======================EJERCICIO 4.2=====================================

        int numeroWhile = 0;

        System.out.println("EJERCICIO 4.2");

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }


//=========================================================================


//=======================EJERCICIO 4.3=====================================

        System.out.println("EJERCICIO 4.3");
        do{
            numeroWhile = 0;
            numeroWhile++;
            numeroWhile++;
            numeroWhile++;
            System.out.println(numeroWhile);

        }while (numeroWhile<3);


//=======================EJERCICIO 4.4===================================

        System.out.println("EJERCICIO 4.4");
        for (int numeroFor=0 ; numeroFor<=3 ;numeroFor++){
            System.out.println(numeroFor);

        }

//=======================================================================

        //System.out.println("Hello world!");
//=======================EJERCICIO 4.5===================================

        System.out.println("EJERCICIO 4.5");
        String estacion="Verano";

        switch (estacion){
            case "Primavera" :
                System.out.println("La estacion es Verano");
                break;
            case "Verano" :
                System.out.println("La estacion es Verano");
                break;
            case "Otono" :
                System.out.println("La estacion es Otoño");
                break;
            case "Invierno" :
                System.out.println("La estacion es Invierno");
                break;
            default:
                System.out.println("No es una estacion!");
        }

//=======================================================================




    }
}