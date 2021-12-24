package br.com.alura.modelo;
import br.com.alura.financeiro.ContaFinanceira;
import br.com.alura.modelo.*;
import br.com.alura.financeiro.*;
public class TestaContaHeranca {
    public static void main(String[] args) {
        Conta C = new ContaFinanceira();
        C.fecha();
    }
}
