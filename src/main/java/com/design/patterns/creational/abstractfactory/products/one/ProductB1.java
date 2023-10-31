package com.design.patterns.creational.abstractfactory.products.one;

import com.design.patterns.creational.abstractfactory.products.ProductB;

public class ProductB1 extends ProductB {
    public ProductB1(Integer value) { super(value); }

    public String diferentiation(){ return "B1"; }
}
