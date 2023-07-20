package com.willdev;

public class Ebook {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private String waterMark;

    public String getWaterMark() {
        return waterMark;
    }
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
