package com.spring.core.demo;

import com.spring.core.demo.entity.Demo;
import com.spring.core.demo.entity.LifecycleDemo;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.*;
import java.sql.SQLOutput;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext context =
                ContextLoader.load();

    }
}
