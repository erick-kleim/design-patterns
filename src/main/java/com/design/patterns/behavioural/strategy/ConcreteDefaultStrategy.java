package com.design.patterns.behavioural.strategy;

import com.design.patterns.behavioural.strategy.context.Context;

public class ConcreteDefaultStrategy implements Strategy{
    @Override
    public void show(Context context) {
        String data1 = "Data 1: " + context.textData();
        String data2 = "Is value negative: " + context.intValueNegative();
        String data3 = "value: " + context.intData();
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

    }
}
