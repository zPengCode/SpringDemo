package com.spring.core.demo.type;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class ExoticType {

    private String name;

    public ExoticType(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExoticType{" +
                "name='" + name + '\'' +
                '}';
    }
}
