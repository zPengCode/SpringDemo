package com.spring.core.demo.ioc.genericity;

/**
 * @author zzp
 * @date 2020/7/10
 */
public class IntegerStore implements Store<Integer> {
    @Override
    public Integer value() {
        return 100;
    }
}
