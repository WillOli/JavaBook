package com.willdev;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.nome = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.name = "Java 8 prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.mostraDetalhes();

        livro.autor = autor;

        Autor outroAutor = new Autor();
        autor.nome = "Paulo Silveira";
        autor.email = "paulo.silveira@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro outroLivro = new Livro();
        outroLivro.name = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        outroLivro.autor = outroAutor;

        livro.mostraDetalhes();


    }
}