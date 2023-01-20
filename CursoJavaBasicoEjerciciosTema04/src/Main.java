import com.objetos.*;



public class Main {
    public static void main(String[] args) {

    SmartDevice dispositivo =new SmartPhone();
    SmartPhone telefono = new SmartPhone();
    SmartWatch reloj = new SmartWatch();

        System.out.println(dispositivo.getConexionBt());
        System.out.println(dispositivo.getConexionWifi());
        System.out.println(dispositivo.getMemoriaRam());
        System.out.println(dispositivo.getProcesador());
        System.out.println(dispositivo.getVoltaje());
        System.out.println(dispositivo.getMemoriaRom());

        System.out.println(telefono.getAgenda());
        System.out.println(telefono.isColgar());
        System.out.println(telefono.isVideollamada());
        System.out.println(telefono.isMarcar());

        System.out.println(reloj.getHora());
        System.out.println(reloj.isBateria());
        System.out.println(reloj.isPantalla());





    System.out.println("\nHello world!");
    }
}