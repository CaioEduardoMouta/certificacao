package br.com.alura.teste;

public class TestaSwitch {
    public static void main(String[] args) {
        int opcao = 3;
        final int variavel = 1;
        switch (2) {
            case variavel:
            System.out.println("Primeira Opção");
            break;
            case 2:
            System.out.println("Segunda Opção");
            break;
            case 3:
            System.out.println("Terceira Opção");
            default:
                System.out.println("Padrão");
        }
    }
}
