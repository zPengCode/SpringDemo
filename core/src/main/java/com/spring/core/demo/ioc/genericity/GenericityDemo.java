package com.spring.core.demo.ioc.genericity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 泛型注入使用，
 * store1 注入了{@link IntegerStore}
 * store2 注入了 {@link StringStore}
 * storeList 集合同样有效
 * @author zzp
 * @date 2020/7/10
 */
public class GenericityDemo {

    @Autowired
    private Store<Integer> store1;

    @Autowired
    private Store<String> store2;

    /**
     * 集合只包含一个元素
     */
    @Autowired
    private List<Store<Integer>> storeList;

    @Override
    public String toString() {
        return "Store1 = " + store1.value() + ",Store2 = " + store2.value() + " -- storeList = " + storeList;
    }
}
