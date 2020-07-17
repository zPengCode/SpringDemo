package com.spring.core.demo;

import com.spring.core.demo.ioc.Demo;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ContextLoader {

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

    public static ApplicationContext load(){
        return new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
    }

    public static ApplicationContext load(String location){
        return new ClassPathXmlApplicationContext(location);
    }

    public static ApplicationContext loadByClass(Class<?>...classes){
        return new AnnotationConfigApplicationContext(classes);
    }

}
