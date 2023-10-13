package com.design.patterns.creational.factorymethod;

import com.design.patterns.creational.factorymethod.factories.concrete.AnotherFactory;
import com.design.patterns.creational.factorymethod.factories.concrete.OtherFactory;
import com.design.patterns.creational.factorymethod.products.concrete.AnotherProduct;
import com.design.patterns.creational.factorymethod.products.concrete.OtherProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryMethodTest {

    @Test
    public void factoryMethodTest(){
        AnotherFactory anotherFactory = new AnotherFactory();
        AnotherProduct productA = (AnotherProduct)anotherFactory.newProcuct();
        Assertions.assertEquals("Same thing done.", productA.doTheSameThing());
        Assertions.assertEquals("Another thing done.", productA.doAnotherThing());

        OtherFactory otherFactory = new OtherFactory();
        OtherProduct productO = (OtherProduct)otherFactory.newProcuct();
        Assertions.assertEquals("Same thing done.", productO.doTheSameThing());
        Assertions.assertEquals("Other thing done.", productO.doOtherThing());
    }
}
