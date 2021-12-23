package br.com.alura.teste;

class Livro {

    public Livro() {
        System.out.println("Sem Argumentos");
    }

    Livro(String... s) {
        System.out.println("Strings");
    }

    Livro(int i){
        this(valor());
        System.out.println("construtor com int");
    }

    static String valor() {
        return "xpto";
    }
}

class TestaConstrutor2 {
    public static void main(String[] args) {
        Livro l = new Livro();
    }

}
