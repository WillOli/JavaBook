package com.willdev.livraria.produtos;

import com.willdev.livraria.Autor;

public class Ebook extends Livro implements Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private String waterMark;
    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescondeDe(double procentagem) {
        return false;
    }

    /*Ao anotar nosso método com @Override, o código não compilará
    * caso esse método não exista na classe pai(superclasse)*/
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        System.out.println("Aplicando desconto no Ebook");
        return super.aplicaDescontoDe(porcentagem);
    }

    @Override
    public String toString() {
        return "Eu sout um Ebook";
    }

    public String getWaterMark() {
        return waterMark;
    }
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
