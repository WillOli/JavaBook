package com.willdev;

public abstract class Livro {
    private String name;
    private String descricao;
    private double valor;
    private String isbn; //International Standard Book Number.
    private Autor autor;
    private boolean impresso;

    /*Construtor com argumento*/
    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

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
    void adicionarValor(double valor) {
        this.valor = valor;
    }
    double retornaValor() {
        return this.valor;
    }
}
