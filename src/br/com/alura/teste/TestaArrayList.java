package br.com.alura.teste;

import javax.xml.xpath.XPathEvaluationResult;
import java.util.ArrayList;

public class TestaArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Java");
        nomes.add("C#");
        nomes.add("Java");

        System.out.println(nomes.contains("Java"));
        System.out.println(nomes.contains("Python"));

        boolean removido = nomes.remove("Java");

        System.out.println(removido);
        System.out.println(nomes.contains("Java"));

        System.out.println(nomes.size());

        Object[] objetos = nomes.toArray();

        String[] nomesArray = nomes.toArray(new String[nomes.size()]);
        String[] nomesArray2 = nomes.toArray(new String[0]);

        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Belgica");

        ArrayList<String> tudo = new ArrayList<>();

        tudo.addAll(nomes);
        tudo.addAll(paises);

        System.out.println(tudo.size());

        System.out.println(nomes.get(0));
        nomes.add(0,"node.js");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));

        nomes.remove(0);
        System.out.println(nomes.get(0));

        nomes.set(0,"Vue.js");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));

        System.out.println(nomes.indexOf("Java"));
        System.out.println(nomes.lastIndexOf("java"));
        System.out.println(nomes.indexOf("C++"));





    }
}
