package com.willdev;

public class RegrasDeDesconto {
    public static void main(String[] args) {
       Autor autor = new Autor();
       autor.setNome("William Oliveira");
       autor.setCpf("000.222.000.11");
       autor.setEmail("william@gmail.com");

       /*Associando o autor ao livro*/
       Livro livro = new Livro(autor);
       livro.setValor(59.90);

       if (!livro.aplicaDescontoDe(0.3)) {
           System.out.println("Desconto no livro não pode ser maior do que 30%");
       } else {
           System.out.println("Valor do livro com desconto " + livro.getValor());
       }

       Ebook ebook = new Ebook(autor);
       autor.mostraDetalhes();
       ebook.setValor(29.90);

       if (!ebook.aplicaDescontoDe(0.51)) {
           System.out.println("Desconto no ebook não pode ser maior do que 15%");
       } else {
           System.out.println("Valor do ebook com desconto: " + ebook.getValor());
       }
    }
}
