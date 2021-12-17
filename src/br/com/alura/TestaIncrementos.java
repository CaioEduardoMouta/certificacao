package br.com.alura;

public class TestaIncrementos {

    public static void main(String[] args) {

        int a = 10;
        a += ++a + a + ++a;

        System.out.println(a);


        int i = 5;
        System.out.println(i++);

        i += 2;
        i -= 2;
        i *= 5;
        i /= 10;
        i *= 100;
        i %= 3;
        System.out.println(i+=3);

        byte b = 15;
        b += 200;
        System.out.println(b);
    }
}
