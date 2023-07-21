package com.willdev.livraria.teste;

import com.willdev.CarrinhoDeCompras;
import com.willdev.LivroFisico;
import com.willdev.livraria.Autor;
import com.willdev.livraria.produtos.Ebook;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Maurício Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setName("Test-Driven Develoment");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setName("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + fisico.getValor());
        }

        System.out.println("Total " + carrinho.getTotal());
    }
}
