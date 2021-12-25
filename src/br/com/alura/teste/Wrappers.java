package br.com.alura.teste;

public class Wrappers {

    public static void main(String[] args) {
        /*
        boolean = Boolean
        byte = Byte
        short = Short
        int = Integer
        char = Character
        long = Long
        double = Double
        float = Float
         */

        Double d1 = new Double(22.4);
        Double d2 = new Double("22.1");
        Double d3 = new Double("22,3");

        Character c = new Character('b');

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean("True");
        Boolean b4 = new Boolean("tRuE");
        Boolean b5 = new Boolean("verdadeiro");//false

        // Wrapper => Primitivos

        Long l = new Long("123");
        //xxxValue

        long l1 = l.longValue();
        int i = l.intValue();
        double d = l.doubleValue();

        boolean b = new Boolean("T").booleanValue();
        char ch = new Character('a').charValue();

        //String => primitivo
        // parseXXX

        double d20 = Double.parseDouble("123.2");
        int i20 = Integer.parseInt("12123312");
        int i21 = Integer.parseInt("10",10);
        int i22 = Integer.parseInt("11",16);
        int i23 = Integer.parseInt("A",16);
        long l20 = Long.parseLong("11",2);

        //String => wrapper
        //Construtor
        //valueOf

        Double d30 = new Double("23.1");
        Double d31 = Double.valueOf("21.2");
        Integer i30 = Integer.valueOf("23");
        Integer i31 = Integer.valueOf("5AF",16);

        //Primitivo => String
        // ToString
         String d40 = Double.toString(24.6);
         String i40 = Integer.toString(212,31);

         // Wrapper = String
         //toString






    }
}
