package com.willdev;

public class LivroFisico  extends Livro{
    public LivroFisico(Autor autor) {
        super(autor);
    }
    public double getTexaImpressao() {
        return this.getValor() * 0.05;
    }
}
