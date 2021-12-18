package br.com.alura.teste;

public class TestaTernario {
    public static void main(String[] args) {

        int i = 5;
        int resultado = (i == 5) ? 100 : 0;
        System.out.println(resultado);
        double resultado2 = (i == 5) ? 100 : 0d;
        System.out.println(i == 5 ? "100" : 0);
    }

}
