package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String toString() {
       return nome;
    }
}
@FunctionalInterface
interface Matcher<T> {
    boolean test(T t);

}

class MaioresDeIdade implements Predicate<Pessoa> {
    public boolean test(Pessoa p) {
        return p.idade >= 18;
    }
}

class FiltradorDePessoas{

    List<Pessoa> filtra(List<Pessoa> todas, Predicate<Pessoa> matcher) {
        List<Pessoa> resultado = new ArrayList<>();
        for (Pessoa p: todas) {
            if(matcher.test(p))
                resultado.add(p);
        }
        return resultado;
    }
}

public class Lambda {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Marlene",36),
                new Pessoa("Maya",0),
                new Pessoa("Caio",28));
        FiltradorDePessoas filtrador = new FiltradorDePessoas();

        //Predicate<Pessoa> criterio = p -> p.idade >= 18;

        List<Pessoa> resultado = filtrador.filtra(pessoas,  p -> p.idade >= 18);
        System.out.println(resultado);

        List<Pessoa> resultado2 = filtrador.filtra(pessoas,  p -> p.nome.startsWith("M"));
        System.out.println(resultado2);

        /*
        Regras
        (String s1, String2} -> {Codigo};
        (s1, s2) -> {codigo}
        p -> {codigo}
        Runnable r = () -> {System.out.println();
/         */

    }

}
