package com.design.patterns.creational.builder.concrete;

import com.design.patterns.creational.builder.Builder;
import com.design.patterns.creational.builder.any.ComplexObject;

public class CompleteBuilder implements Builder {

    private ComplexObject object;

    public CompleteBuilder(){
        this.object = new ComplexObject();
    }

    @Override
    public Builder buildIntValue(Integer... data) {
        if(data.length != 4)
            throw new RuntimeException("Short builder must have only 4 Integer data");

        object.setData1(data[0]);
        object.setData2(data[1]);
        object.setData3(data[2]);
        object.setData4(data[3]);
        return this;
    }

    @Override
    public Builder buildStringValue(String... data) {
        if(data.length != 4)
            throw new RuntimeException("Short builder must have only 4 String data");

        object.setData5(data[0]);
        object.setData6(data[1]);
        object.setData7(data[2]);
        object.setData8(data[3]);
        return this;
    }

    @Override
    public Builder buildBooleanValue() {
        object.setData9(true);
        object.setData10(false);
        return this;
    }

    @Override
    public ComplexObject getObject() {
        return object;
    }
}
