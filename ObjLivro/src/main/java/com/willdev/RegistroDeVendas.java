package com.willdev;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Maurício Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setName("Test-Driven Develoment");

        Ebook ebook = new Ebook(autor);
        ebook.setName("Test-Driven Development");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
    }
}
