package Mensajero;

public class Mensajero {
    void enviar() {
        System.out.println("El mensaje llego a su bandeja de spam");
    }
}

class SMS extends Mensajero {
    @Override
    void enviar() {
        System.out.println("Su codigo via sms es: 876435");
    }
}

class main extends Mensajero {
    public static void main(String[] args) {
        SMS sms = new SMS();
        Mensajero mensajero = new Mensajero();
        mensajero.enviar();
        sms.enviar();
    }
}
