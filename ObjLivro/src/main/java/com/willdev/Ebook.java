package com.willdev;

public class Ebook extends Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private String waterMark;
    public Ebook(Autor autor) {
        super(autor);
    }

    /*Ao anotar nosso método com @Override, o código não compilará
    * caso esse método não exista na classe pai(superclasse)*/
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        return super.aplicaDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}