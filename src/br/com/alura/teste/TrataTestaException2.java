package br.com.alura.teste;

import java.io.*;

class AcessoAoArquivo {
    InputStream is = new FileInputStream("a.txt");

    AcessoAoArquivo() throws FileNotFoundException {
    }
}

class SaldoInsuficienteException extends Exception {
    SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

class ContaDoBem {
    double saldo = 100;
    void saca(double quantidade) throws SaldoInsuficienteException {
        if(this.saldo < quantidade) {
            throw new SaldoInsuficienteException("Saldo Insuficiente"
            + saldo + "para sacar" + quantidade);
        }
        saldo -= quantidade;
    }
}

class TestaTrataException3 {
    public static void metodo1()  {
        try{
            new ContaDoBem().saca(500);
        } catch (NullPointerException ex) {
            System.out.println("tratei NullPointer");
        } catch (SaldoInsuficienteException ex) {
            System.out.println("tratei saldo");
        }

    }
    public static void main(String[] args) throws IOException  {
        metodo1();
    }
}

public class TrataTestaException2 {

    public static void metodo1() {
        System.out.println("Primeiro Antes");
        try {
            metodo2();
            System.out.println("Primeiro Depois");
        } catch (NullPointerException ex) {
            System.out.println("Tratei");
        }
        System.out.println("fim do metodo 1");

    }
    public static void metodo2() {
        String s = null;
        System.out.println("Segundo Antes");
        s.length();
        System.out.println("Segundo Depois");
    }

    public static void main(String[] args) {
        metodo1();
    }
}
