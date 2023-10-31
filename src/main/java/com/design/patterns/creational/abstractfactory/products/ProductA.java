package com.design.patterns.creational.abstractfactory.products;

public abstract class ProductA {
    String value;

    public abstract String diferentiation();

    public ProductA(String value) {
        this.value = value;
    }

    public String print(){
        return String.format("Product%s: %s", diferentiation(), value);
    }

}
