package br.com.alura.teste;

import java.util.Locale;

public class TestaStrings {

    public static void main(String[] args) {

        String texto = "Pretendo fazer a prova de certificação de Java";
        System.out.println(texto.indexOf("Pretendo"));
        System.out.println(texto.indexOf("Saudade"));
        System.out.println(texto.indexOf("prova"));
        System.out.println(texto.lastIndexOf("o"));
        System.out.println(texto.indexOf("e",7));
        System.out.println(texto.lastIndexOf("a",44));
        System.out.println(texto.startsWith("Protendo"));
        System.out.println(texto.startsWith("Pretendia"));
        System.out.println(texto.endsWith("Java"));
        System.out.println(texto.endsWith("C#"));


        System.out.println("Java".equals("java"));
        System.out.println("Java".equalsIgnoreCase("java"));

        System.out.println("Certificado".compareTo("aio"));
        System.out.println("Certificado".compareTo("Certificado"));
        System.out.println("Certificado".compareTo("Gamba"));
        System.out.println("Certificado".compareTo("certificado"));
        System.out.println("Certificado".compareToIgnoreCase("certificado"));


        String java = "Java";
        System.out.println(java.substring(1));

        String text = "   certificado java   ".toUpperCase().trim();

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
