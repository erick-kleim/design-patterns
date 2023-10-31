package com.design.patterns.creational.abstractfactory.factories;

import com.design.patterns.creational.abstractfactory.products.ProductA;
import com.design.patterns.creational.abstractfactory.products.ProductB;

public interface AbstractFactory {
    ProductA createProductA(String value); // also namede like "makeProductA()" create == make
    ProductB createProductB(Integer value);
}
