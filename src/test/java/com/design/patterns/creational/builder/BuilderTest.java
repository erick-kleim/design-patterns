package com.design.patterns.creational.builder;

import com.design.patterns.creational.builder.any.ComplexObject;
import com.design.patterns.creational.builder.concrete.CompleteBuilder;
import com.design.patterns.creational.builder.concrete.ShortBuilder;
import com.design.patterns.creational.builder.director.BuilderDirector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BuilderTest {

    @Test
    public void completeBuilderTest(){
        BuilderDirector builderDirector = new BuilderDirector(new CompleteBuilder());
        builderDirector.makeCompleteComplexObject();
        ComplexObject object = builderDirector.getComplexObject();

        Assertions.assertEquals(3, object.getData3());
        Assertions.assertEquals(4, object.getData4());
        Assertions.assertEquals("3", object.getData7());
        Assertions.assertEquals("4", object.getData8());
        Assertions.assertTrue(object.isData9());
        Assertions.assertFalse(object.isData10());
    }

    @Test
    public void shortBuilderTest(){
        BuilderDirector builderDirector = new BuilderDirector(new ShortBuilder());
        builderDirector.makeShortComplexObject();
        ComplexObject object = builderDirector.getComplexObject();

        Assertions.assertNull(object.getData3());
        Assertions.assertNull(object.getData4());
        Assertions.assertEquals("No data", object.getData7());
        Assertions.assertEquals("No data", object.getData8());
        Assertions.assertFalse(object.isData9());
        Assertions.assertFalse(object.isData10());
    }
}
