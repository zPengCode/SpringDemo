package com.spring.core.demo.ioc.genericity;

/**
 * @author zzp
 * @date 2020/7/10
 */
public class StringStore implements Store<String> {
    @Override
    public String value() {
        return "hello";
    }
}
