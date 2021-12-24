package br.com.alura.teste;

import java.io.IOException;

interface G {
    void x();
}

class H implements G {
    public void x(){

    }
}
class Veiculo {
    public void liga() throws IOException {
        System.out.println("O veiculo esta sendo ligado");
    }
}

class Helicoptero extends Veiculo {
    public void liga() {
        System.out.println("Ligando o helicoptero");
    }
}

abstract  class Droid extends Veiculo {
    public abstract void liga();
}

class HexaDroid extends Droid{
    public void liga() {
        System.out.println("hexa");
    }
}

class FabricaDeVeiculo {
    Veiculo fabrica() {
        return new Veiculo();
    }
}

class FabricaHexaDroid {
        Veiculo fabrica() {
            return new HexaDroid()
        }
}

public class TestaReescrita {

    public static void main(String[] args) throws IOException{
        Veiculo h1 = new FabricaHexaDroid().fabrica();
        h1.liga();
    }
}
