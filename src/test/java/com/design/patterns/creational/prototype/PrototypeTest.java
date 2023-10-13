package com.design.patterns.creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrototypeTest {

    @Test
    public void propotipeTest(){
        Prototype prototype = new Prototype();
        prototype.intVariable=10;
        prototype.stringVariable="Ten";
        prototype.booleanVariable=true;
        Prototype clone = Prototype.clone(prototype);

        Assertions.assertEquals(prototype.intVariable, clone.intVariable);
        Assertions.assertEquals(prototype.stringVariable, clone.stringVariable);
        Assertions.assertEquals(prototype.booleanVariable, clone.booleanVariable);
        Assertions.assertNotEquals(prototype, clone);
    }

    @Test
    public void prototyperegistryTest(){
        createPrototype("POSITIVE");
        createPrototype("NEGATIVE");

        Prototype negative1 = PrototypeRegistry.getInstance().getPrototype("NEGATIVE");
        Prototype negative2 = PrototypeRegistry.getInstance().getPrototype("NEGATIVE");
        negative2.intVariable = 2;
        Prototype negative3 = PrototypeRegistry.getInstance().getPrototype("NEGATIVE");
        negative3.intVariable = 3;
        Assertions.assertEquals(1, PrototypeRegistry.getInstance().getPrototype("NEGATIVE").intVariable);

        Prototype positive1 = PrototypeRegistry.getInstance().getPrototype("POSITIVE");
        Prototype positive2 = PrototypeRegistry.getInstance().getPrototype("POSITIVE");
        positive2.intVariable = 2;
        Prototype positive3 = PrototypeRegistry.getInstance().getPrototype("POSITIVE");
        positive3.intVariable = 3;
        Assertions.assertEquals(1, PrototypeRegistry.getInstance().getPrototype("POSITIVE").intVariable);
    }

    private static void createPrototype(String key) {
        Prototype prototype = new Prototype();
        prototype.intVariable = 1;
        prototype.stringVariable = "COUNT";
        prototype.booleanVariable = key.equals("POSITIVE");

        PrototypeRegistry.getInstance().addPrototype(key, prototype);
    }
}
