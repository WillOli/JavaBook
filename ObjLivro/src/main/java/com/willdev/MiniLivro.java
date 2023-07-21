package com.willdev;

import com.willdev.livraria.Autor;

public class MiniLivro extends Livro {
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescondeDe(double procentagem) {
        return false;
    }
}

