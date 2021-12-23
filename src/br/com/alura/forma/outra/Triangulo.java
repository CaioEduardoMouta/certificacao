package br.com.alura.forma.outra;

import br.com.alura.forma.Forma;

public class Triangulo extends Forma {

    public void imprime() {
        System.out.println("Lado = " + this.lado);
        System.out.println("Lado = " + ((Forma) this).lado);
    }


}
