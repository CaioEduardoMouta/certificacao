package br.com.alura.teste;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf(1);

        int intPrimitivo = intWrapper.intValue();
        intPrimitivo++;
        intWrapper = Integer.valueOf(intPrimitivo);

        //Java 5 - AutoBoxing
        Integer intWrapperJ5 = Integer.valueOf(1);
        intWrapperJ5++;


    }
}
