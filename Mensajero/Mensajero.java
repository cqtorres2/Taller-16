package Mensajero;

public class Mensajero {
    void enviar() {
        System.out.println("Su codigo de mensaje via correo es: 5423343");
    }
}

class Datos extends Mensajero {
    String correo;
    String Asunto;
    String Destinatario;

}

class SMS extends Mensajero{
    @Override
    void enviar(){
        System.out.println("Su codigo via sms es: 876435");
    }
}

class main extends Mensajero{
    public static void main(String[] args) {
        SMS sms = new SMS();
        sms.enviar();

    }

}
