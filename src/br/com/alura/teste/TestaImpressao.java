package br.com.alura.teste;



public class TestaImpressao {
    public String toString() {
        return "um objeto do tipo TesteImpresao";
    }
    public static void main(String[] args) {
        char[] letras = {'a','b'};

        System.out.print(1);
        System.out.print(2.0);
        System.out.print(" Texto");
        System.out.print('a');
        System.out.print(new TestaImpressao());
        System.out.print(new int[10]);
        System.out.print(new char[10]);
        System.out.print(letras);
        //\n pular linha
        System.out.println("_________");
        System.out.print("foo\n");
        System.out.print("bar\n");
        //Format e printf funcionam da mesma maneira
        //%s foi substituido por Caio
        System.out.format("Hello %s, Have a good day","Caio");
        System.out.printf(" foo");

        System.out.format("%b %n", false);
        System.out.format("%d %n",42);
        System.out.format("%f %n",44.2);

        System.out.format("%s, o numero: %d esta correto? : %b%n", "Sim",42,true);

        System.out.format("%2$s %1$s","World", "Hello");
        System.out.format("[%5d]%n",42);
        System.out.format("[%+5d]%n",42);
        System.out.format("[%+5d]%n",-22);
        System.out.format("[%5d]%n",-22);
        System.out.format("[%5d]%n","foo");

        System.out.println('b');

        //Alinha para esquerda
        System.out.format("[%-5d]%n",-22);
        System.out.format("[%-5s]%n","FOO");

        System.out.format("[%,f]%n",4433122124.99);

        System.out.format("%0,8.2f",22.899);



    }
}
