package br.com.alura.teste;

public class TestaPrecedenciaTrocada {
    public static void main(String[] args) {
        int a = 15 * 4 + 1;
        System.out.println(a);

        int b = 15 * (4 + 1);
        System.out.println(a);

        System.out.println(15 + 0 + "é cento e cinquenta");
        System.out.println(15 + (0 + "é cento e cinquenta"));

        System.out.println(("Caio" + "Mouta").length());
    }
}
