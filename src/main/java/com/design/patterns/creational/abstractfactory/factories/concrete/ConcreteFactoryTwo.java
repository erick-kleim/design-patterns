package com.design.patterns.creational.abstractfactory.factories.concrete;

import com.design.patterns.creational.abstractfactory.factories.AbstractFactory;
import com.design.patterns.creational.abstractfactory.products.ProductA;
import com.design.patterns.creational.abstractfactory.products.ProductB;
import com.design.patterns.creational.abstractfactory.products.two.ProductA2;
import com.design.patterns.creational.abstractfactory.products.two.ProductB2;

public class ConcreteFactoryTwo implements AbstractFactory {
    @Override
    public ProductA createProductA(String value) {
        return new ProductA2(value + "\n*create by FactoryTwo*");
    }

    @Override
    public ProductB createProductB(Integer value) {
        return new ProductB2(value);
    }
}
