package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.factories.concrete.ConcreteFactoryOne;
import com.design.patterns.creational.abstractfactory.factories.concrete.ConcreteFactoryTwo;
import com.design.patterns.creational.abstractfactory.products.ProductA;
import com.design.patterns.creational.abstractfactory.products.ProductB;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AbstractFactoryTest {
    @Test
    public void createAllProducts(){
        ConcreteFactoryOne one = new ConcreteFactoryOne();
        ConcreteFactoryTwo two = new ConcreteFactoryTwo();

        ProductA a1 = one.createProductA("ONE");
        ProductB b1 = one.createProductB(111);

        ProductA a2 = two.createProductA("TWO");
        ProductB b2 = two.createProductB(222);

        assertEquals("ProductA1: ONE\n*create by FactoryOne*", a1.print());
        assertEquals("ProductB1: 111", b1.print());
        assertEquals("ProductA2: TWO\n*create by FactoryTwo*", a2.print());
        assertEquals("ProductB2: 222", b2.print());
    }
}
