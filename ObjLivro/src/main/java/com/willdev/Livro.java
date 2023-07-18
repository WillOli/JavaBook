package com.willdev;

public class Livro {
    String name;
    String descricao;
    double valor;
    String isbn; //International Standard Book Number.
    Autor autor;

    /*Método que apenas imprime os valores da classe*/
    void mostraDetalhes() {
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostraDetalhes();

        if (this.temAutor()) {
            autor.mostraDetalhes();
        }
        System.out.println("--");
    }

    /*Método que aplica desconto nos livros.*/
    public void aplicaDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }
    boolean temAutor() {
        return this.autor != null;
    }
}
