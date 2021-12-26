package br.com.alura.teste;

public class Person {

    private String nome;
    private String sobrenome;

    public Person(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

}
