package com.design.patterns.creational.abstractfactory.factories.concrete;

import com.design.patterns.creational.abstractfactory.factories.AbstractFactory;
import com.design.patterns.creational.abstractfactory.products.ProductA;
import com.design.patterns.creational.abstractfactory.products.ProductB;
import com.design.patterns.creational.abstractfactory.products.one.ProductA1;
import com.design.patterns.creational.abstractfactory.products.one.ProductB1;

public class ConcreteFactoryOne implements AbstractFactory {
    @Override
    public ProductA createProductA(String value) {
        return new ProductA1(value + "\n*create by FactoryOne*");
    }

    @Override
    public ProductB createProductB(Integer value) {
        return new ProductB1(value);
    }
}
