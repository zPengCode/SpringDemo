package com.spring.core.demo.ioc;


import com.spring.core.demo.ContextLoader;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class FactoryBeanDemoTest {

    ApplicationContext context;

    @Before
    public  void before(){
        System.out.println("before");
        context = ContextLoader.load();
    }

    @Test
    public void testFactoryGetBean(){
        assert context != null;
        // 获取FactoryBean产生的Bean
        System.out.println(context.getBean("factoryBeanDemo"));
    }


    @Test
    public void testGetFactoryBean(){
        assert context != null;
        // 获取FactoryBean
        System.out.println(context.getBean("&factoryBeanDemo"));
    }
}
