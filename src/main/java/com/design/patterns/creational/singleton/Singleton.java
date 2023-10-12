package com.design.patterns.creational.singleton;

/**
 * Garantir que uma classe tenha somente uma instancia no programa
 * e fornecer um ponto de acesso global a mesma.
 */
public class Singleton {
    /**
     * Add any pértinent variables and methods
     */
    private Singleton instancia;
    private Singleton(){}
    public Singleton getInstancia() {
        if (instancia == null)
            return instancia = new Singleton();

        return instancia;
    }
}
