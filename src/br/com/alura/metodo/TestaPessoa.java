package br.com.alura.metodo;

public class TestaPessoa {

    public static void main(String[] args) {
        Person P = new Person();
        P.setNome("Mouta",28);

        String nome = P.getNome();
        System.out.println(nome);

        System.out.println(P.getNome());
        P.getNome();

    }
}
