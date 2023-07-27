package com.willdev.livraria.produtos;

import com.willdev.livraria.Autor;

public abstract class Livro implements Produto {
    private String name;
    private String descricao;
    private double valor;
    private String isbn; //International Standard Book Number.
    private Autor autor;

    /*Construtor com argumento*/
    public Livro(Autor autor) {
        if (autor == null) {
            throw new RuntimeException
                    ("O Autor do livro não pode ser nulo");
        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    public abstract boolean aplicaDescondeDe(double procentagem);

    /*Construtor sem argumento*/
    public Livro(){

    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    @Override
    public String toString() {
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {
            autor.toString();
        }
        System.out.println("--");
        return null;
    }



    /*Método que apenas imprime os valores da classe*/
    public String mostraDetalhes() {
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
        return mensagem;
    }

    /*Método que aplica desconto nos livros.*/
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        System.out.println("Aplicando desconto no livro");
        this.valor -= this.valor * porcentagem;
        return true;
    }
    boolean temAutor() {
        return this.autor != null;
    }
    public void adicionarValor(double valor) {
        this.valor = valor;
    }
    public double retornaValor() {
        return this.valor;
    }
}
