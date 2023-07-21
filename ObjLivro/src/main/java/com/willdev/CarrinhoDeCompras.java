package com.willdev;

import com.willdev.livraria.produtos.Livro;
import com.willdev.livraria.produtos.Produto;
import com.willdev.livraria.produtos.Revista;

public class CarrinhoDeCompras {

    private double total;
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    private Produto produto4;

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

        if (this.produto1 != null) {
            this.produto1 = produto;
        } else if (this.produto2 != null) {
            this.produto2 = produto;
        } else if (this.produto3 !=null) {
            this.produto3 = produto;
        } else if (this.produto4 != null) {
            this.produto4 = produto;
        } else {
            System.out.println("Não tem mais espaços");
            return;
        }

        total += produto.getValor();
    }
    public double getTotal() {
        return total;
    }
}
