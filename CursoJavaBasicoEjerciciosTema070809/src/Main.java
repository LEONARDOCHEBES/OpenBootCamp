import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        String mensaje="hola mundo";
        System.out.println("==========Resultado ejercicio 0========== \n");
        System.out.print(reverse(mensaje));
        System.out.println("\n");

//=================Ejercicio 1.0(INICIO)==============================================
    String arrayStrings[]={"pepe","open", "bootcamp"};
        System.out.println("==========Resultado ejercicio 1 ============\n");
        for (int i =0;i<arrayStrings.length;i++){
        System.out.println(arrayStrings[i]);
    }
    System.out.println("");
//=================Ejercicio 1.0(FIN)==============================================


//=================Ejercicio 2.0(INICIO)==============================================
        int arrayBidi[][]={
                {2,4,5},
                {3,5,6}
        };/*new int[2][3];
        arrayBidi[0][0]=2;
        arrayBidi[0][1]=4;
        arrayBidi[0][2]=5;

        arrayBidi[1][0]=3;
        arrayBidi[1][1]=5;
        arrayBidi[1][2]=6;*/
        System.out.println("==========Resultado ejercicio 2 ============\n");
        for (int i=0;i< arrayBidi.length;i++){
            for (int j=0;j<arrayBidi[1].length;j++){
                System.out.print("Estoy en fila "+i+" ,columna: "+j+" ");
                System.out.print(", El valor es: "+arrayBidi[i][j]+"\n");
            }
        }
        for (int i=0;i< arrayBidi.length;i++){
            System.out.print("\n Fila n: " +i+" => ");
            for (int j=0;j<arrayBidi[1].length;j++){;
                System.out.print(" | "+arrayBidi[i][j]+" | ");
            }
        }
//=================Ejercicio 2.(FIN)==============================================


//=================Ejercicio 3.0(INICIO)==============================================
        Vector<String> nombre=new Vector<String>();
        System.out.println("\n");
        System.out.println("==========Resultado ejercicio 3 ============\n");

        nombre.add("manolo0");
        nombre.add("manolo1");
        nombre.add("manolo2");
        nombre.add("manolo3");
        nombre.add("manolo4");

        for (String nombres:
             nombre) {
            System.out.println(nombres);
        }
        nombre.remove(1);
        nombre.remove(2);

        System.out.println("\nRemovidos segundo y tercer elemento: \n");
        for (String nombres:
                nombre) {
            System.out.println(nombres);
        }
//=================Ejercicio 3.0(FIN)==============================================



//=================Ejercicio 4.0(INICIO)==============================================

        System.out.println("\n==========Resultado ejercicio 4 ============\n");
        System.out.println("Si el vector con capacidad por defecto tiene\n" +
                "que ingresar 1000 valores, se reconvertiria demaciadas\n" +
                "veces y eso provocaria consumo execivo de memoria.\n");

//=================Ejercicio 4.0(FIN)==============================================



//=================Ejercicio 5.0(INICIO)==============================================
        System.out.println("\n==========Resultado ejercicio 5 ============\n");
        ArrayList<String> arrayLista=new ArrayList<>();
        arrayLista.add("jorge");
        arrayLista.add("estufa");
        arrayLista.add("casco");
        System.out.println("Se imprime array list: \n");
        for (String objetoListaArray:
             arrayLista) {
            System.out.println(objetoListaArray);
        }
        //Se crea linked list y se agregan los elementos del array list al objeto ligada lista
        LinkedList<String> ligadaLista=new LinkedList<>();
        ligadaLista.addAll(arrayLista);
        System.out.println("\nSe imprime linked list: \n");
        for (String objetoLigadaLista:
                ligadaLista) {
            System.out.println(objetoLigadaLista);
        }
        System.out.println("");
//=================Ejercicio 5.0(FIN)==============================================


//=================Ejercicio 6.0(INICIO)==============================================
        ArrayList<Integer> arrayListaEnteros=new ArrayList<>();
        System.out.println("\n==========Resultado ejercicio 6 ============\n");
        System.out.println("Rellenamos array y lo imprimimos: \n");
        for (int i=0;i<=9;i++){
            arrayListaEnteros.add(i+1);
            System.out.println(arrayListaEnteros.get(i));
         }
        System.out.println("");
        System.out.println("Quitamos numeros pares y lo imprimimos: \n");
        for (int i=0;i<arrayListaEnteros.size();i++){

            if ((((Integer) arrayListaEnteros.get(i)) % 2) == 0){
                arrayListaEnteros.remove(i);
                continue;
            }
        }
        for (int enteros:
             arrayListaEnteros) {
            System.out.println(enteros);
        }
//=================Ejercicio 6.0(FIN)==============================================


        System.out.println("\n==========Resultado ejercicio 7 ============\n");
        try {
            DividePorCero(2,0);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
//=================Ejercicio 8.(INICIO)==============================================

        System.out.println("\n==========Resultado ejercicio 8 ============\n");
        try {
            CopiaDeFichero("C:\\Users\\Desk01\\IdeaProjects\\CursoJavaBasicoEjerciciosTema070809\\src\\ejemplo.txt","\\ejemploNuevo.txt");
        }catch (IOException e){
            System.out.print(e.getMessage());
        }finally {
            System.out.println("Archivo creado en: c:\\ejemploNuevo.txt ");
        }
//=================Ejercicio 8.0(FIN)==============================================


}//(FIN EJECUCION)

    //======================EJERCICIO 1.0(INICIO)====================
    public static String reverse(String texto) {
        String alrevez="";
        for(int i =texto.length()-1; i>=0;i--){
            alrevez+= texto.charAt(i);
        }
        return alrevez;
    }
    //======================EJERCICIO 1.0(FIN)====================

    //=================Ejercicio 7.0(INICIO)==============================================

    public static int DividePorCero(int numero1,int numero2) throws ArithmeticException {

        int resultado=0;
        try {
            resultado= numero1 / numero2;
        }catch (ArithmeticException e){
            throw new ArithmeticException() ;
        }
        return resultado;
    }
//=================Ejercicio 7.0(FIN)==============================================

    public static void CopiaDeFichero(String fileIn,String fileOut) throws FileNotFoundException, IOException {
        InputStream ficheroIngresa = new FileInputStream(fileIn);

        byte[] datos = ficheroIngresa.readAllBytes();
        /*for (byte dato:
             datos) {
            System.out.print((char) dato);
        }*/

        OutputStream ficheroEgresa =new FileOutputStream(fileOut);
        ficheroEgresa.write(datos);
    }
}