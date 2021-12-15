package br.com.alura.financeiro;


import br.com.alura.Produto;
import br.com.alura.modelo.Endereco;
import br.com.alura.modelo.Quadrado;
import br.com.alura.modelo.Pessoa;
import br.com.alura.certificacao.dao.ProdutoDAO;
import br.com.alura.modelo.Util;

import java.util.Date;

import static br.com.alura.modelo.Util.TAMANHO;

public class Pedido {

Quadrado quadrado;
ProdutoDAO dao;
Pessoa cliente;
Endereco endereco;
Date dataDeCriação;
Date dataDeFinalizacao;
Produto produto;


    public Pessoa getCliente() {
        return cliente;
    }

    public void calculaTudo() {
        int t = TAMANHO;
        Util.maior(3,10);
    }
}
