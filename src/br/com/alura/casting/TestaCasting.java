package br.com.alura.casting;

interface Automatico{}
class Veiculo{}
class Moto extends Veiculo{}
class Carro extends Veiculo{}
class CarroAutomatico extends Carro implements Automatico{}
class Motox extends Moto implements Automatico{}

public class TestaCasting {
    public static void main(String[] args) {

        CarroAutomatico ca = new CarroAutomatico();
        Carro c2 = ca;

        boolean tipoAutomatico = c2 instanceof  Automatico;
        if(c2 instanceof Automatico) {
            System.out.println("eh automatico");
        }

        Automatico a = (Automatico) c2;

        Moto m2 = new Moto();
        Automatico a2 = (Automatico) m2;

        String mouta = (String) "Caio";
        String nome = (String) mouta;



        Veiculo v = new Carro();
        Moto m = (Moto) v;

        Carro c = new Carro();
        //Moto m2 = (Moto) c;

        Carro carro = new Carro();
        Object[] objetos = new Object[100];
        String s = "certificacao";
        objetos[0] = s;

        String recuperada = (String) objetos[0];

    }
}
