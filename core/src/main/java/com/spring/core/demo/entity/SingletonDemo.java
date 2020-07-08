package com.spring.core.demo.entity;

public class SingletonDemo {

    private static SingletonDemo instance = null;

    private SingletonDemo(){}

    private Demo demo;

    private SingletonDemo(Demo demo){
        this.demo = demo;
    }

    public synchronized static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }

    public static SingletonDemo getInstance(Demo demo){
        if(instance == null){
            instance = new SingletonDemo(demo);
        }
        return instance;
    }
}
