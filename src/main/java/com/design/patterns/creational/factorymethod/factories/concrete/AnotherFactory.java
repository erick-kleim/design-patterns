package com.design.patterns.creational.factorymethod.factories.concrete;

import com.design.patterns.creational.factorymethod.factories.FactoryMethod;
import com.design.patterns.creational.factorymethod.products.Product;
import com.design.patterns.creational.factorymethod.products.concrete.AnotherProduct;

public class AnotherFactory implements FactoryMethod {

    @Override
    public Product newProcuct(){
        return new AnotherProduct();
    }
}
