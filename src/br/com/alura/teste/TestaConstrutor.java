package br.com.alura.teste;

class Automovel {
    double velocidade = 30;

}

class Carro extends Automovel{
    double velocidade = super.velocidade;
    double velocidadeDoCarro() {
        return this.velocidade;
    }
    double velocidadeDoAutomovel() {
        return super.velocidade;
    }
}

class Mother {
    long numeroGrande;
    long segundoNumeroGrande;
    Mother() {

    }
    Mother(String s) {
        System.out.println("Mãe");
    }

    Mother(int i){}
}

class Daughter extends Mother {
    long segundoNumeroGrande;
    Daughter(int i){
        this("numero" +i);
        super.numeroGrande = 33;
        this.segundoNumeroGrande = 33;
        super.segundoNumeroGrande = 22;
        i = 3;
        s = "Caio";
        System.out.println("Fim do construtor com numero");
    }
    String s;
    Daughter(String s) {
        super(s);
        this.s = s;
        System.out.println(s);
    }
}


public class TestaConstrutor {
    public static void main(String[] args) {

        new Daughter("Maya");
        new Daughter(222);

        Carro c = new Carro();
        ((Automovel)c).velocidade = 50;
        System.out.println("Carro" + c.velocidadeDoCarro());
        System.out.println("Automoveil" + c.velocidadeDoAutomovel());

    }

}
