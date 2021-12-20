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

        Client Caio = new Client();
        Caio.nome = "Mouta";

        ArrayList<Client> clients = new ArrayList<>();

        clients.add(Caio);

        System.out.println(Caio.nome);
        System.out.println(clients.get(0).nome);

        Caio.nome = "Carrazedo";

        System.out.println(Caio.nome);
        System.out.println(clients.get(0).nome);






    }
}
