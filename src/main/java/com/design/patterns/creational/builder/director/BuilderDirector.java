package com.design.patterns.creational.builder.director;

import com.design.patterns.creational.builder.Builder;
import com.design.patterns.creational.builder.any.ComplexObject;

public class BuilderDirector {
    private final Builder builder;

    public BuilderDirector(Builder builder){
        this.builder = builder;
    }

    public ComplexObject getComplexObject(){
        return builder.getObject();
    }

    public void makeCompleteComplexObject(){
        Integer methodToFindDataA = 1;
        Integer methodToFindDataB = 2;
        Integer methodToFindDataC = 3;
        Integer methodToFindDataD = 4;
        builder.buildIntValue(new Integer[]{methodToFindDataA, methodToFindDataB, methodToFindDataC, methodToFindDataD})
                .buildStringValue(new String[]{methodToFindDataA.toString(), methodToFindDataB.toString(), methodToFindDataC.toString(), methodToFindDataD.toString()})
                .buildBooleanValue();
    }
    public void makeShortComplexObject(){
        Integer methodToFindDataA = 1;
        Integer methodToFindDataB = 2;

        builder.buildIntValue(new Integer[]{methodToFindDataA, methodToFindDataB})
                .buildStringValue(new String[]{methodToFindDataA.toString(), methodToFindDataB.toString()})
                .buildBooleanValue();

    }
}
