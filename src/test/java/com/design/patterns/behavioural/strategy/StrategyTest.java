package com.design.patterns.behavioural.strategy;

import com.design.patterns.behavioural.strategy.context.ConcreteContext;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StrategyTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originOut = System.out;
    @BeforeEach
    public void init(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public static void end(){
        System.setOut(originOut);
    }

    @Test
    public void strategyTest(){
        ConcreteContext sameContext = new ConcreteContext();
        sameContext.setStrategy(new ConcreteDefaultStrategy());
        sameContext.show();
        String expected1 = """
                Data 1: Information 1
                Is value negative: true
                Value: 99999
                """;

        sameContext.setStrategy(new ConcreteDifferentStrategy());
        sameContext.show();
        String out = outContent.toString();
        String expected2 = """
                Data 1: Information 1
                Value: -99999
                """;
        assertEquals(expected1+expected2, out);
    }
}

