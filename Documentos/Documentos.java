package Documentos;

public class Documentos {
    void Exportar() {
        System.out.println("Su documento pdf es:");
    }
}

class Word extends Documentos {
    @Override
    void Exportar() {
        System.out.println("Su documento Word es:");
    }
}

class Excel extends Documentos {
    @Override
    void Exportar() {
        System.out.println("Su hoja de calculo exceld es:");
    }
}
class Main {
public static void main(String[] args) {
    Word word = new Word();
    Excel excel = new Excel();
    Documentos documentos = new Documentos();
    word.Exportar();
    excel.Exportar();
    
}
    
}
