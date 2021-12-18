package br.com.alura.teste;

public class TestaComparacao {
    public static void main(String[] args) {
        System.out.println(1 == (100.0 / 100.0));

        int idade = 25;
        System.out.println(idade = 1);

        System.out.println(1.0f == 1.0d);
        System.out.println(1.0f == 1l);

        System.out.println(true == true);
        System.out.println(true != false);

        System.out.println(1 == 1.0);
        System.out.println(1 != 1);

        System.out.println(2 >= 1);
        System.out.println(2 <= 1);
        System.out.println(2 > 1);
        System.out.println(2 < 1);

    }
}
