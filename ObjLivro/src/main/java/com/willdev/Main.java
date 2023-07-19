package com.willdev;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new Livro();
        livro.setName ("Java 8 Prático");
        livro.setName("Novos recursos da linguagem");
        livro.adicionarValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        /*Associando o livro ao autor*/
        livro.setAutor(autor);
        livro.mostraDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10");


        Livro outroLivro = new Livro();
        outroLivro.setName("Lógica de programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.adicionarValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");
        /*Associando o livro ao autor*/
        outroLivro.setAutor(outroAutor);

        outroAutor.mostraDetalhes();

        System.out.println("Valor atual: " + livro.retornaValor());

        if (!livro.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.print("Valor com desconto: " + livro.retornaValor());
        }

    }
}