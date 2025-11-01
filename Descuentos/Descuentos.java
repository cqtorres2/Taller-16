public class Descuentos {
    int precioOriginal;
    int descuento;
    double precioTrasDescuento;
}

class PorcentajeDeDescuento extends Descuentos {
    public PorcentajeDeDescuento(int descuento, int precioOriginal) {
        this.descuento = descuento;
        this.precioOriginal = precioOriginal;
        double descontado = descuento / 100.0;
        this.precioTrasDescuento = precioOriginal * (1 - descontado);
    }

    void demostrar() {
        System.out.println("El precio del articulo son " + precioOriginal + " viene con una oferta de un " + descuento
                + "% de descuento, que deja el articulo en " + precioTrasDescuento);
    }
}

class Main extends Descuentos {
    public static void main(String[] args) {
        PorcentajeDeDescuento porcentajeDeDescuento = new PorcentajeDeDescuento(20, 5000);
        porcentajeDeDescuento.demostrar();
    }
}