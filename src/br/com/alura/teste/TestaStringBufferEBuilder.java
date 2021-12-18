package br.com.alura.teste;

import br.com.alura.Carro;

public class TestaStringBufferEBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Code");
        sb.append(" - ");
        sb.append("Ensino e Inovação");
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder(sb);
        sb3.append(" e alura e casa do Código");
        sb3.append('x');
        sb3.append(sb);
        sb3.append(new Carro());
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("CaioEduardo");
        sb4.insert(11,"Mouta");
        System.out.println(sb4);
        sb4.delete(5, 10);
        System.out.println(sb4);

        String valor = sb4.toString();
        System.out.println(new StringBuffer("Eduardo").reverse());

        StringBuilder sb5 = new StringBuilder("Alura - Data Science");
        System.out.println(sb5.substring(6,12));
        System.out.println(sb5.subSequence(6,12));
        System.out.println(sb5);

    }
}
