package br.com.alura.teste;

import br.com.alura.modelo.Endereco;

class Mae{

}

class Filha extends  Mae {

}

class Neta extends Filha {

}

class Avenida extends Endereco {

}

class x {
    int x;
    public void y() {
        System.out.println("Invocando y em um objeto");
    }
}

class Y extends x {

}
class W {
    public static void metodo() {

        System.out.println("Invocando o metodo estatico");
    }

}
class Z extends W {

}
class Gato {
    String corDosOlhos;
    public String toString() {
        return  "[Gato " + corDosOlhos + "]";
    }
}


public class TestaHeranca {

    public static void main(String[] args) {
        Gato g = new Gato();
        g.corDosOlhos = "mel";
        System.out.println("Estou com um: " + g);
        Y y = new Y();
        y.x = 15;
        y.y();

        W.metodo();
        Z.metodo();

        Z z = new Z();
        z.metodo();

        W w = new Z();
        w.metodo();

    }
}
