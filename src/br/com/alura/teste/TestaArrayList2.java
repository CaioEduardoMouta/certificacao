package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Iterator;

public class TestaArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Java");
        nomes.add("PHP");
        nomes.add("JS");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            String atual = it.next();
            System.out.println(atual);
            it.remove();
        }
        System.out.println(nomes.size());

        for(String nome: nomes) {
            System.out.println(nome);
        }
    }
}
