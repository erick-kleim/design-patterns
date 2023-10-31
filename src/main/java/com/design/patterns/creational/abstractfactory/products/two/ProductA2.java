package com.design.patterns.creational.abstractfactory.products.two;

import com.design.patterns.creational.abstractfactory.products.ProductA;

public class ProductA2 extends ProductA {
    public ProductA2(String value) { super(value); }

    @Override
    public String diferentiation() { return "A2"; }
}
