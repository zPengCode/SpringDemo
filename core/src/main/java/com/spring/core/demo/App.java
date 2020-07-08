package com.spring.core.demo;

import com.spring.core.demo.entity.Demo;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.io.File;
import java.net.URL;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
        context.getBean("demo", Demo.class).print();

//        GenericApplicationContext context = new GenericApplicationContext();
//        new XmlBeanDefinitionReader(context).loadBeanDefinitions("config/applicationContext.xml");
//        context.refresh();
    }
}
