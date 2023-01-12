package principal;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();


        cliente.setEdad(35);
        cliente.setTelefono(1125654587);
        cliente.setNombre("pancho");
        cliente.setCredito(100000);

        System.out.println("");

        System.out.println("El cliente nombre: "+cliente.getNombre()+" ,con telefono: "
                +cliente.getTelefono()+" ,de "+cliente.getEdad()+" Años, tiene un credito por valor: "
                +cliente.getCredito());

        System.out.println("");

        trabajador.setEdad(65);
        trabajador.setTelefono(115625587);
        trabajador.setNombre("patroclo");
        trabajador.setSalario(900000);

        System.out.println("El trabajador nombre: "+trabajador.getNombre()+" ,con telefono: "
                +trabajador.getTelefono()+" ,de "+trabajador.getEdad()+" Años, tiene un salario por valor: "
                +trabajador.getSalario());

    }
}