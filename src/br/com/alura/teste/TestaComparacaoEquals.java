package br.com.alura.teste;

class Cliente {
    String nome;
    public Cliente(String nome){
        this.nome = nome;
    }

    public boolean equals(Object o){
        Cliente outro = (Cliente)o;
        return this.nome.equals(outro.nome);
    }
}

public class TestaComparacaoEquals {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Caio");
        Cliente c2 = new Cliente("Eduardo");

        Cliente c3 = new Cliente("Eduardo");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
        System.out.println(c2.equals(c3));
        System.out.println(c2.equals((Object)c3));
    }
}
