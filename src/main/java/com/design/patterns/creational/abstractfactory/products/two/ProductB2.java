package com.design.patterns.creational.abstractfactory.products.two;

import com.design.patterns.creational.abstractfactory.products.ProductB;

public class ProductB2 extends ProductB {
    public ProductB2(Integer value) {
        super(value);
    }

    @Override
    public String diferentiation() {
        return "B2";
    }
}
