package com.willdev;

import com.willdev.livraria.Autor;
import com.willdev.livraria.produtos.Promocional;

public class LivroFisico  extends Livro implements Promocional {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescondeDe(double procentagem) {
        return false;
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
