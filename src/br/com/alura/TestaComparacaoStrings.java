package br.com.alura;

public class TestaComparacaoStrings {
    public static void main(String[] args) {
        String nome1 = "Caio";
        String nome2 = "Caio";
        String nome3 = new String("Caio");
        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome3);
        System.out.println(nome1.endsWith(nome3));


    }
}
