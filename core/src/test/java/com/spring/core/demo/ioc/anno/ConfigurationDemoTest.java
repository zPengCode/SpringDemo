package com.spring.core.demo.ioc.anno;

import com.spring.core.demo.ContextLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import javax.security.auth.login.Configuration;

import static org.junit.Assert.*;

public class ConfigurationDemoTest {

    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = ContextLoader.loadByClass(ConfigurationDemo.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test01(){
        SystemServiceA ssa = context.getBean("systemServiceA1",SystemServiceA.class);
        SystemServiceC ssc = context.getBean(SystemServiceC.class);
        System.out.println("ssa = " + ssa);
        System.out.println("ssc = " + ssc);

    }
}