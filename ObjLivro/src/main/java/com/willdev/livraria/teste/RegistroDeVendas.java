package com.willdev.livraria.teste;

import com.willdev.CarrinhoDeCompras;
import com.willdev.livraria.produtos.LivroFisico;
import com.willdev.livraria.Autor;
import com.willdev.livraria.produtos.Ebook;
import com.willdev.livraria.produtos.Produto;

import java.io.FileNotFoundException;

public class RegistroDeVendas {
    public static void main(String[] args) throws FileNotFoundException {
        Autor autor = new Autor();
        autor.setNome("Maurício Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setName("Test-Driven Develoment");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setName("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + fisico.getValor());
        }

        Produto[] produtos = carrinho.getProdutos();

        for (int i = 0; i <= produtos.length; i++) {
            try {
                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("deu exception no indice: " + i);
            } catch (NullPointerException e) {
                System.out.println("A array não foi instanciado!");
            }
        }
        System.out.println("Fui executado");
        System.out.println("Total " + carrinho.getTotal());
        System.out.println(ebook);

    }
}
