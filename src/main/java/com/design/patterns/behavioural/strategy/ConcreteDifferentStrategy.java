package com.design.patterns.behavioural.strategy;

import com.design.patterns.behavioural.strategy.context.Context;

public class ConcreteDifferentStrategy implements Strategy{

    @Override
    public void show(Context context) {
        String data1 = "Data 1: " + context.textData();
        System.out.println(data1);

        int valor = context.intData();
        if(context.intValueNegative() && context.intData()>0) {
            valor = Math.negateExact(valor);
        }
        String data2 = "Data 2: " + valor;
        System.out.println(data2);
        String data3 = String.format("value: %n",Math.negateExact(context.intData()));
    }
}
