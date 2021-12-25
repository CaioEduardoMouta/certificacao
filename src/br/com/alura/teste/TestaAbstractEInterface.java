package br.com.alura.teste;

interface Aa {
    public static final int X = 10;
}

abstract class SemMetodo {

}
abstract class ComMetodoAbstrato {
    abstract void executa();
}
interface Vehicle{
     void liga();
    void desligar();
}

class MotoCycle implements Vehicle {

    @Override
    public void liga() {

    }

    @Override
    public void desligar() {

    }
    

}

class Wagen implements Vehicle {

    @Override
    public void liga() {

    }

    @Override
    public void desligar() {

    }

    public void run(){

    }
}

abstract class WagenAutomatique extends Wagen {
    public abstract void liga();
}
abstract class CarroAutomaticoBonito extends WagenAutomatique {

}

public class TestaAbstractEInterface {

    public static void main(String[] args) {

        System.out.println(Aa.X);
        Wagen c = new Wagen();
        c.liga();
    }
}
