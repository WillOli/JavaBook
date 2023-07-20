package com.willdev;

public class LivroFisico  extends Livro{
    public LivroFisico(Autor autor) {
        super(autor);
    }
    public double getTexaImpressao() {
        return this.getValor() * 0.05;
    }
    /*Aplicando a regra de negócio de desconto para o Livro físico*/

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no Livrofísico");
        return true;
    }
}
