package com.willdev;

public class Livro {
    String name;
    String descricao;
    double valor;
    String isbn; //International Standard Book Number.

    void mostraDetalhes() {
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");
    }

}
