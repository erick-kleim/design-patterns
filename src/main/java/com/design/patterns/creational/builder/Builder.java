package com.design.patterns.creational.builder;

import com.design.patterns.creational.builder.any.ComplexObject;

public interface Builder {

    public Builder buildIntValue(Integer... data);
    public Builder buildStringValue(String... data);
    public Builder buildBooleanValue();
    public ComplexObject getObject();
}
