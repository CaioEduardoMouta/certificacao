package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Date;

class BlocoEstatico{
    static {
        String s = null;
        s.length();
    }
}

class NovaConta {
    double saldo = 100;
    public void saca(double valor) {
        if(saldo<valor) {
            throw new IllegalArgumentException();
        }
        saldo -= valor;
    }
}
class Tarefa {
    boolean rodando = false;
    void start() {
        if(rodando) {
            throw  new IllegalArgumentException();
        }
        rodando = true;
    }
    void stop() {
        rodando = false;
    }
}

public class TestaException4 {
    void metodo() {
        metodo();
    }
    public static void main(String[] args) {

        boolean sempre = true;
        ArrayList<String> strings = new ArrayList<String>();
        String inicial = "Caio";
        while(sempre) {
            inicial += "Caio";
            strings.add(inicial);
        }

        new BlocoEstatico();
        new TestaException4().metodo();

        Tarefa t = new Tarefa();
        t.start();


        new NovaConta().saca(300);

        String numero1 = "1a";
        int um = Integer.parseInt(numero1);

        Object o = "Caio";
        Date data = (Date) o;

        String s = null;
        s.length();

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Caio");
        lista.add("Mouta");

        lista.get(2);
    }
}
