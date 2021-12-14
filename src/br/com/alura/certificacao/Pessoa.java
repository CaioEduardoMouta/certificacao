package br.com.alura.certificacao;

/**Javadoc
 *
 */

interface A {
    public static final int tamanho = 5;
    void autentica(String nome, String senha);
}

class B {
    int B;

    B() {
        //A.tamanho = 15;
    }

    void B() {

    }
}
// Publico só pode ter um e o nome tem que ser igual o arquivo
public class Pessoa {

    static int totalDePessoas = 0;
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        String sobrenome = "Mouta";
        return nome + sobrenome;

    }
}
