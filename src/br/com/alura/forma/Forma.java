package br.com.alura.forma;

public class Forma {
    public double lado;
    public double getArea() {
        return 0;
    }

    double getPerimetro() {
        return 10;
    }

    private String cor = "verde";
    void imprimeCor() {
        System.out.println(cor);
    }
}

class Forma2 {
    void metodo() {
        Forma f = new Forma();

    }
}
