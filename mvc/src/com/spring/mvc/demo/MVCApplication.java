package com.spring.mvc.demo;

import com.spring.mvc.demo.service.IDemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MVCApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/WEB-INF/applicationContext.xml",
                        "dispatcher-servlet.xml");
        System.out.println(context);
        IDemoService demoService = context.getBean("demoService",IDemoService.class);
        System.out.println(demoService.getDemoString());

    }
}
