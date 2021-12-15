package br.com.alura;

class Motor {

}

class Carro {
    int ano = 1931;
    char primeiraLetra;
    boolean usado;
    Motor motor;
    String marca;
}

public class Teste {

    public static void main(String[] args) {
        boolean valor = true;

        int x = 15;
        double v = 10.2d;
        long l = 12L;
        float f = 21.1f;

        int i = 0762;
        System.out.println(i);

        Carro carro = new Carro();
            //Valores padrões de atributos referências
        System.out.println(carro.ano);
        System.out.println(carro.primeiraLetra ==0);
        System.out.println(carro.usado);
        System.out.println(carro.motor);
        System.out.println(carro.marca);
    }
}
