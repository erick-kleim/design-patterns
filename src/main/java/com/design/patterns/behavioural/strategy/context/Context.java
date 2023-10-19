package com.design.patterns.behavioural.strategy.context;

import com.design.patterns.behavioural.strategy.Strategy;

public abstract class Context {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Strategy getStrategy() {
        return strategy;
    }
    public void show(){
        strategy.show(this);
    }

    public abstract String textData();
    public abstract boolean intValueNegative();
    public abstract int intData();

}
