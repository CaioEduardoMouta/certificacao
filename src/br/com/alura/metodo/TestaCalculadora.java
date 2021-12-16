package br.com.alura.metodo;

class Calculadora {
    public int soma(String nome, int... numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }
}

public class TestaCalculadora {

    public static void main(String[] args) {
       Calculadora c = new Calculadora();
        System.out.println(c.soma("Mouta",3,5));
        System.out.println(c.soma("Mouta",3,41,21,24));
        System.out.println(c.soma("Mouta",3,41,21,04,10));
        System.out.println(c.soma("Mouta",3,41,21,31,9,1));
    }
}
