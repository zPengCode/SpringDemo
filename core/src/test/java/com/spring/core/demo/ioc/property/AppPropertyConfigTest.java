package com.spring.core.demo.ioc.property;

import com.spring.core.demo.ContextLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.*;

public class AppPropertyConfigTest {

    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = ContextLoader.loadByClass(AppPropertyConfig.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test01(){
        context.getBean(AppPropertyConfig.class).contain("spring.demo.param1");
    }
}