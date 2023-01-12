package principal;

public class Main {

    public static void main(String[] args) {

//===================EJERCICIO 8.1===========================
        Persona persona =new Persona();

        persona.setEdad(25);
        persona.setNombre("Braulio");
        persona.setTelefono(11252525);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
//===========================================================
}