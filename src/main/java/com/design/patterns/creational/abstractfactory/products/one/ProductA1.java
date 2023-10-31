package com.design.patterns.creational.abstractfactory.products.one;

import com.design.patterns.creational.abstractfactory.products.ProductA;

public class ProductA1 extends ProductA {
    public ProductA1(String value) { super(value); }

    @Override
    public String diferentiation() { return "A1"; }

}
