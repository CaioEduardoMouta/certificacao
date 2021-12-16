package br.com.alura;

class Motor {

}

class Car {
    int ano = 1931;
    char primeiraLetra;
    boolean usado;
    Motor motor;
    String marca;
}

public class Teste {

    public static void main(String[] args) {

        char sete = '\u03A9';
        System.out.println(sete + "<-- aqui ele");

        boolean bonitao345521212121 = true;
        boolean ricão$$$$;
        boolean bonito_e_rico = false;
        boolean bonitoERico;
        boolean $valor;
        boolean _valor;

        int idade = 1;
        int IDADE = 2;
        int Idade = 3;

        boolean valor = true;

        long x2 = 1_123_452_123_234l;

        int x = 0xF_F;
        System.out.println(x);
        double v = 10.2d;
        long l = 12L;
        float f = 21.1f;

        double d2 = 3.1E2;
        System.out.println(d2);

        float f2 = 2e3f;
        System.out.println(f2);

        int i = 0762;
        System.out.println(i);

        Car car = new Car();
            //Valores padrões de atributos referências
        System.out.println(car.ano);
        System.out.println(car.primeiraLetra ==0);
        System.out.println(car.usado);
        System.out.println(car.motor);
        System.out.println(car.marca);
    }
}
