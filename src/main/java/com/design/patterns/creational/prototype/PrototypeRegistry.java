package com.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    /*Using the Singleton design pattern here*/
    private static final PrototypeRegistry INSTANCE = new PrototypeRegistry();
    private static final Map<String, Prototype> REGISTRY = new HashMap<>();

    private PrototypeRegistry(){}

    public static  PrototypeRegistry getInstance(){
        return INSTANCE;
    }

    public Prototype getPrototype(String key){
        Prototype prototype = REGISTRY.get(key);
        return Prototype.clone(prototype);
    }

    public void addPrototype(String key, Prototype valor){
        REGISTRY.put(key, valor);
    }
}
