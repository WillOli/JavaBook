package com.willdev;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.name = "Java 8 prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.mostraDetalhes();

        System.out.println();

        Livro outroLivro = new Livro();
        outroLivro.name = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        livro.mostraDetalhes();


    }
}