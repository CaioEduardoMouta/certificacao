package br.com.alura.teste;

import java.util.ArrayList;

public class TestaFor {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Caio");
        nomes.add("Eduardo");
        for(String nome : nomes) {
            System.out.println(nome);
        }

//        int [] numeros = {1,2,3,4,5,6};
//        for(int i = 0; i < numeros.length; i++) {
//            int numero = numeros[i];
//            System.out.println(numero);
//        }
//
//        for (int numero:numeros)
//            System.out.println(numero);
//
//        int i,j;
//        for(i =0, j = 10; i < 10; System.out.println(i + " " + j), i++, j--) {
//            System.out.println("mensagem");
//        }

    }
}
