package com.design.patterns.creational.singleton;

/**
 * Garantir que uma classe tenha somente uma instancia no programa
 * e fornecer um ponto de acesso global a mesma.
 */
public class Singleton {
    private Singleton(){}
    private Singleton instance;
    public Singleton getInstance() {
        if (instance == null)
            return instance = new Singleton();

        return instance;
    }
    /**
     * Add any pertinent variables and methods
     */
}
