package br.com.alura.teste;

public class TestaArray {
    public static void main(String[] args) {

        int[] idades = {0,2,3,5,7,8,10};

        idades[4] = 10;

        int[] idades2;

        idades2 = new int[]{0,2,4,6,8,10};

        System.out.println(idades2[2]);
        System.out.println(idades.length);

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        for(int idade :  idades){
            System.out.println(idade);
        }


    }


}
