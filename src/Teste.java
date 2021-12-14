class Pessoa {
    static int x = 0;

    public static void setX(int x) {
        Pessoa.x = x;
    }

    int y = 0;

    public void setY(int y) {
        this.y = y;
    }
}
    class X {
        int a = 10;
        public void metodo() {
            int a = 20;
            System.out.println(a);
        }
    }
public class Teste {


    public static void main(String[] args) {
        new X().metodo();

    }
}
