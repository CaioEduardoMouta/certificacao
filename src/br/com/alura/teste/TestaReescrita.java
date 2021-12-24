package br.com.alura.teste;

import java.io.IOException;

class J{
    public void metodo() {
        System.out.println("a");
        this.metodo2();
    }
    public void metodo2() {
        System.out.println("metodo 2 do pai");
    }
}

class H extends J {
    public void metodo() {
        System.out.println("b");
        super.metodo();
    }
    public void metodo2() {
        System.out.println("c");
        metodo();
        super.metodo();
    }

    public static void main(String[] args) {
        new H().metodo2();
    }
}

class Veiculo {
     void liga() throws IOException {
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
        HexaDroid fabrica() {
            return new HexaDroid();
        }
}

class TestaReescrita {
    static void metodo(Veiculo v) throws IOException {
        v.liga();
    }

    public static void main(String[] args) throws IOException{
        metodo(new HexaDroid());
        metodo(new Veiculo());
        metodo(new Helicoptero());
    }
}
