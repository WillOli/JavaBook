package com.willdev;

import com.willdev.livraria.produtos.Livro;
import com.willdev.livraria.produtos.Produto;
import com.willdev.livraria.produtos.Revista;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;


    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }

    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " + revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador ++;
        this.total += produto.getValor();
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }
}
