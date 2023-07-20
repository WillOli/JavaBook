package com.willdev;

public interface Promocional {
    boolean aplicaDescontoDe(double procentagem);

    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}
