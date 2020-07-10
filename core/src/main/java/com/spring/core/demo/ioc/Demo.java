package com.spring.core.demo.ioc;

public class Demo {

    private String param1;
    private String param2;

    public Demo(){}

    public Demo(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public void print(){
        System.out.println("hello world");
    }

    static class InnerDemo{
        public void innerPrint(){
            System.out.println("inner hello world");
        }
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }
}
