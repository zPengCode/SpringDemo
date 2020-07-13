package com.spring.core.demo.ioc.i18n;

import com.spring.core.demo.ContextLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.*;

public class MessageSourceDemoTest {

    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = ContextLoader.load();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test01(){
        MessageSourceDemo bean = context.getBean(MessageSourceDemo.class);
        bean.println();
    }
}