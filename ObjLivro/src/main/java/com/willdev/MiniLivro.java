package com.willdev;

public class MiniLivro extends Livro {
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescondeDe(double procentagem) {
        return false;
    }
}

