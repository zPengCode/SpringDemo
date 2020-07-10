package com.spring.core.demo.ioc.genericity;

import com.spring.core.demo.ContextLoader;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;


public class GenericityDemoTest {

    ApplicationContext context;
    @Before
    public void before(){
        context = ContextLoader.load();
    }

    @Test
    public void testGeneric(){
        // 泛型自动装配
        GenericityDemo genericityDemo = context.getBean("genericityDemo", GenericityDemo.class);
        System.out.println(genericityDemo);
    }

}
