package br.com.alura.teste;

class Overloader {

    public void metodo2(String s) {
        System.out.println("Com String");
    }

    public void metodo2(Object s) {
        System.out.println("Com object");
    }

    public void metodo3(String a, int b) {
        System.out.println("String,int");
    }

    public void metodo3(int b, String a) {
        System.out.println("int,String");
    }

    public void metodo4(int a, double b) {
        System.out.println("int, double");
    }


    public void metodo4(double a, int b) {
        System.out.println("double, int");
    }

    public void metodo5(String a, Object b){
        System.out.println("String,Object");
    }

    public void metodo5(Object a, String b){
        System.out.println("String,Object");
    }

    public void metodo6(Object a, Object b) {
        System.out.println("Object, String");
    }

    public void metodo6(String a, String b) {
        System.out.println("Object, String");
    }




    public void metodo(int a) {
        System.out.println("com int");

    }
    public void metodo(double a) {
        System.out.println("Com Double");
    }

    public void metodo() {
        System.out.println("Sem nada");
    }
}

public class TesteOverload {



    public static void main(String[] args) {

        new Overloader().metodo6("Caio","Mouta");
        new Overloader().metodo6(new Object(), new Object());
        new Overloader().metodo6("Mouta", new Object());


        new Overloader().metodo4(4,5.4);
        new Overloader().metodo4(4.2,3);
     //   new Overloader().metodo4(4,3);

        new Overloader().metodo2("Caio");
        new Overloader().metodo2((Object) "Caio");
        new Overloader().metodo2(new Object());
        new Overloader().metodo();
        new Overloader().metodo((short) 123);
        new Overloader().metodo(324);
        new Overloader().metodo((float) 123);
        new Overloader().metodo(231.1);

    }
}
