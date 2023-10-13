package com.design.patterns.creational.prototype;
/*
* The class Prototype is the onw object
* */
public final class Prototype {

    int intVariable;
    String stringVariable;
    boolean booleanVariable;

    public static Prototype clone(Prototype prototype){
        Prototype clone = new Prototype();
        clone.intVariable = prototype.intVariable;
        clone.stringVariable = prototype.stringVariable;
        clone.booleanVariable = prototype.booleanVariable;
        return clone;
    }
}
