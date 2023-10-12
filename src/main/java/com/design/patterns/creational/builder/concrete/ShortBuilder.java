package com.design.patterns.creational.builder.concrete;

import com.design.patterns.creational.builder.Builder;
import com.design.patterns.creational.builder.any.ComplexObject;

public class ShortBuilder implements Builder{

    private final ComplexObject object;

    public ShortBuilder(){
        this.object = new ComplexObject();
    }

    @Override
    public Builder buildIntValue(Integer... data) {
        if(data.length != 2)
            throw new RuntimeException("Short builder must have only 2 Integer data");

        object.setData1(data[0]);
        object.setData2(data[1]);
        object.setData3(null);
        object.setData4(null);
        return this;
    }

    @Override
    public Builder buildStringValue(String... data) {
        if(data.length != 2)
            throw new RuntimeException("Short builder must have only 2 String data");

        object.setData5(data[0]);
        object.setData6(data[1]);
        object.setData7("No data");
        object.setData8("No data");
        return this;
    }

    @Override
    public Builder buildBooleanValue() {
        object.setData9(false);
        object.setData10(false);
        return this;
    }

    @Override
    public ComplexObject getObject() {
        return object;
    }
}
