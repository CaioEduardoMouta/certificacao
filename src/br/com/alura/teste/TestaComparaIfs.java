package br.com.alura.teste;

public class TestaComparaIfs {

    public static void main(String[] args) {
        boolean autentico = true;

        if(autentico){
            System.out.println("OK");
        }else {
            System.out.println("Não autorizado");
        }

        if(1 < 2){
            System.out.println("ok");
        }

        boolean valor = true;

        if (valor == false) {
            System.out.println("false");
        }

        if (valor) {
            System.out.println("valor");
        }

        int a = 0, b = 3;

        if(a == b) {
            System.out.println("iguais");
        }

        if(valor = false) {
            System.out.println("false");
        }

        boolean v = true;

        if(v) {
            System.out.println("true");
        } else if( valor){
            System.out.println("false");
        } else if(!valor) {
            System.out.println("false");
        }else {
            System.out.println("so else");
        }

        if(autentico)
            System.out.println("autentico");
        else
            System.out.println("falhou");
        System.out.println("Tente novamente");
    }
}
