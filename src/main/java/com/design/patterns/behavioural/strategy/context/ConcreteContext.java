package com.design.patterns.behavioural.strategy.context;

public class ConcreteContext extends Context {
    @Override
    public String textData() {
        return "Information 1";
    }
    @Override
    public boolean intValueNegative() {
        return true;
    }
    @Override
    public int intData() { return 99999; }
}
