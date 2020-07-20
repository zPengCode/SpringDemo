package com.spring.dao.demo;

import com.spring.dao.demo.transction.UserBean;
import com.spring.dao.demo.transction.service.ProgramUserService;
import com.spring.dao.demo.transction.service.UserService;
import com.spring.dao.demo.transction.service.impl.ProgramUserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
       test02(context);
    }

    public static void test01(ApplicationContext context){
        UserService userService = context.getBean("userService", UserService.class);
        UserBean userBean = new UserBean("hello","123");
        userService.add(userBean);
        userService.modify(userBean);
        userService.getUserBean("123","123");
        userService.getUserBeans();
    }

    public static void test02(ApplicationContext context){
        ProgramUserService programUserService = context.getBean("programUserService", ProgramUserServiceImpl.class);
        programUserService.doSomeService2();
        System.out.println(programUserService.doSomeService1(new UserBean("123","123")));
    }
}
