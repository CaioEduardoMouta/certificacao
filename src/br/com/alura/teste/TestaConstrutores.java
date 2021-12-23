package br.com.alura.teste;

class A {

    int i = 15;
    String nome;
    String sobrenome = "Mouta";
    int tamanho = tamanhoDoSobrenome();

    A(String nome) {
       imprimeNome();
       this.nome = nome;
    }
    private void imprimeNome() {
        System.out.println(nome);
    }

    int tamanhoDoSobrenome() {
        return sobrenome.length();
    }
    A() {

    }
}

class B extends A {
    B(String s) {
        super(s);
    }
    void imprimeNome() {
        System.out.println(nome.length());
    }
}

public class TestaConstrutores {

    public static void main(String[] args) {
        A a = new A();
        A b = new A("Caio");
        System.out.println(b.i);
        B c = new B("Caio");

    }
}
