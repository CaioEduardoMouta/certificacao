package br.com.alura.teste;

public class TestaFor {

    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6};
        for(int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.println(numero);
        }

        int i,j;
        for(i =0, j = 10; i < 10; System.out.println(i + " " + j), i++, j--) {
            System.out.println("mensagem");
        }
    }
}
