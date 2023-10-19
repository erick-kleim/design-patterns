package com.design.patterns.behavioural.strategy;

import com.design.patterns.behavioural.strategy.context.Context;

public class ConcreteDifferentStrategy implements Strategy{

    @Override
    public void show(Context context) {
        String data1 = "Data 1: " + context.textData();
        System.out.println(data1);

        int valor = Math.abs(context.intData());
        if(context.intValueNegative())
            valor = -valor;

        String data2 = "Value: " + valor;
        System.out.println(data2);
    }
}
