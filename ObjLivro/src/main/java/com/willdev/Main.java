package com.willdev;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.name = "Java 8 prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.adicionarValor(59.90);
        livro.isbn = "978-85-66250-46-6";
        /*Associando o livro ao autor*/
        livro.autor = autor;

        livro.mostraDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789.10";


        Livro outroLivro = new Livro();
        outroLivro.name = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.adicionarValor(59.90);
        outroLivro.isbn = "978-85-66250-22-0";
        /*Associando o livro ao autor*/
        outroLivro.autor = outroAutor;

        outroAutor.mostraDetalhes();

        System.out.println("Valor atual: " + livro.retornaValor());

        if (!livro.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.print("Valor com desconto: " + livro.retornaValor());
        }

    }
}