package com.design.patterns.creational;
/**
 * Apenas uma variação do padrão Singleton, porém considerando multiplas threads.
 */
public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;
    private SingletonThreadSafe(){
    }
    public static SingletonThreadSafe getInstance() {
        if(instance==null)
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) instance = new SingletonThreadSafe();
            }
        return instance;
    }
}
