package br.com.alura.teste;

public class TesteOperadoresLogicos {

    public static boolean metodo (String msg) {
        System.out.println(msg);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(1 == 1 && metodo("primeiro"));
        System.out.println(1 != 1 && metodo("segundo"));
        System.out.println(1 == 1 || metodo("terceiro"));
        System.out.println(1 == 1 ^ 1 > 2);
        System.out.println(!(1 == 1));

    }
}
