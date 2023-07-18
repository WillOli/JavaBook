package com.willdev;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.name = "Java 8 prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        System.out.println("O nome do livro é " + livro.name);
        System.out.println(livro.descricao);
        System.out.println(livro.valor);
        System.out.println(livro.isbn);


        System.out.println();

        Livro outroLivro = new Livro();
        outroLivro.name = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        System.out.println(outroLivro.name);
        System.out.println(outroLivro.descricao);
        System.out.println(outroLivro.valor);
        System.out.println(outroLivro.isbn);
    }
}