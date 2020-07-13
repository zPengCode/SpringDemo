package com.spring.core.demo.spel;

import com.spring.core.demo.ContextLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

import static org.junit.Assert.*;

public class SpelDemoTest {

    AnnotationConfigApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context = (AnnotationConfigApplicationContext) ContextLoader.loadByClass(SpelDemo.class);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test01(){
        ExpressionParser parser = new SpelExpressionParser();
        Expression hw1 = parser.parseExpression("'hello world'");
        System.out.println("hw1 = " + hw1.getValue());
        Expression hw2 = parser.parseExpression("'hello'.concat('world')");
        System.out.println("hw2 = " + hw2.getValue());
        System.out.println("1 / 2 = " + parser.parseExpression("1 div 2").getValue(Float.class));
        System.out.println("Class = " + parser.parseExpression("T(java.util.Date)").getValue());
    }

    @Test
    public void test02(){
        System.out.println(context.getBean(PropertyValueTestBean.class));
    }
}