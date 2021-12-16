package br.com.alura;

import java.util.Locale;

public class TestaStrings {

    public static void main(String[] args) {

        String java = "Java";
        System.out.println(java.substring(1));

        String texto = "   certificado java   ".toUpperCase().trim();

        String s = "Docker";
        s = s.toUpperCase();
        System.out.println(s);

        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println("".isEmpty());
        System.out.println("Mouta".isEmpty());

        System.out.println("    Mouta    ".trim());
        System.out.println(s.replace('C','D'));
        System.out.println(s.replace("ck","dg"));

        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");

        char[] nome = new char[]{'J','a','v','a'};
        String nome1 = new String(nome);

        StringBuilder sb1 = new StringBuilder("Java");
        String nome2 = new String(sb1);

        String nomeNulo = null;

        String nomeDaProva = "Certificação" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;
        System.out.println(nomeDaProva);
        System.out.println(nomeDaProvaComNulo);

        System.out.println("Certificação + 1345");
        System.out.println(1234 + "Certificação");
        System.out.println(1234 + "Certificação");
        System.out.println(1 + 500 +"Certificação");


    }
}
