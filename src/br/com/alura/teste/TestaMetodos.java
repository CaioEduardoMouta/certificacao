package br.com.alura.teste;


import java.io.IOException;

class Param {
    String getNumero(int a) {
        if(true) return "verdadeiro";
        throw new RuntimeException("Exception");
    }
    void primitivo(double a) {
            return;
    }
    void referencia(Object o) {

    }
    void teste(final int a, int b) {
        b = 19;
       // a = 100;
    }
}

class ClasseComMetodos{


    int getNumero()  {
        return 5;
    }
}

public class TestaMetodos {
    public static void main(String[] args) {
        Param p = new Param();
        int a = 1;
        System.out.println(p.getNumero(46));

        p.primitivo('Z');
        p.referencia(new Object());
        p.referencia("guilherme");
        p.primitivo(a);
        p.teste(1,2);
    }
}
