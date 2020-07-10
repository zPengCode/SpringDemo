package com.spring.core.demo.ioc;

import com.spring.core.demo.ContextLoader;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;


public class QualifierDemoTest {

    ApplicationContext context;

    @Before
    public void before(){
        context = ContextLoader.load();
    }

    @Test
    public void testQualifier(){
        QualifierDemo qualifierDemo = context.getBean("qualifierDemo", QualifierDemo.class);
        System.out.println(qualifierDemo);
    }
}
