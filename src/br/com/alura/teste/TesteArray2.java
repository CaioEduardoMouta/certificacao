package br.com.alura.teste;

public class TesteArray2 {

    public static void main(String[] args) {
        Client clientes[] = new Client[10];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Client();
            clientes[i].nome = "Maya";
        }

        for (Client c : clientes) {
            System.out.println(c.nome);
        }

        Client clientes2[] = new Client[5];
        clientes2[0] = new Client();
        clientes2[1] = new ClienteEspecial();

        Client Caio = new Client();
        Caio.nome = "Caio";

        clientes2[0] = Caio;

        System.out.println(Caio.nome);
        System.out.println(clientes2[0].nome);

        Caio.nome = "Mouta";

        System.out.println(Caio.nome);
        System.out.println(clientes2[0].nome);

        int[] valores = new int[10];
        //long numeros[] =(long[]) valores;

        String[] nomes = {"Marlene", "Maya"};
        Object[] objetos;

        objetos = nomes;

        for (Object o : objetos) {
            System.out.println(o);
        }
    }


}

class Client {
    String nome;
}

class ClienteEspecial extends Client {

}

