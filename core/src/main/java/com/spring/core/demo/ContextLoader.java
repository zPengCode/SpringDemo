package com.spring.core.demo;

import com.spring.core.demo.entity.Demo;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class ContextLoader {

    public static void main(String[] args) {
//        test01();
//        test02();
    }

    public static void test01(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
        context.getBean("demo", Demo.class).print();
    }

    public static void test02(){

        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("config/applicationContext.xml");
        context.refresh();
        context.getBean("demo",Demo.class).print();
    }

}
