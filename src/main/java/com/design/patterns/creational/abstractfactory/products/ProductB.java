package com.design.patterns.creational.abstractfactory.products;

public abstract class ProductB {
    Integer value;
    public abstract String diferentiation();

    public ProductB(Integer value) {
        this.value = value;
    }

    public String print(){
        return String.format("Product%s: %s", diferentiation(), value.toString());
    }
}
