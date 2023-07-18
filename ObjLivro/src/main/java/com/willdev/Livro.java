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
        System.out.println("--");

    }
}
