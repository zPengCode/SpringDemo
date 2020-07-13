package com.spring.core.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    ApplicationContext context;

    @Before
    public void setUp(){
        context = ContextLoader.load();
    }
    @Test
    public void shouldAnswerWithTrue() {
        System.out.println(context.getBean("SystemServiceC"));
    }
}
