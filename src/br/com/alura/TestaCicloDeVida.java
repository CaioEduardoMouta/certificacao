package br.com.alura;

class Carros {
    Carro c1;
    Carro c2;
}

public class TestaCicloDeVida {

    public static void main(String[] args) {

        Carros carros = new Carros();


        Carro c = new Carro();
        c.ano = 2021;
        c.modelo = "Punto";
        carros.c1 = c;

        c = new Carro();

        c = null;

        if(15 > 10) {
            Carro c2 = new Carro();
            c2.ano = 2010;
        }

        Carro c3;
        for(int i=0; i < 10; i++) {
             c3 = new Carro();
        }



    }
}
