package com.spring.dao.demo;

import com.spring.dao.demo.transction.UserBean;
import com.spring.dao.demo.transction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        UserBean userBean = new UserBean("hello","123");
        userService.add(userBean);
        userService.modify(userBean);
        userService.getUserBean("123","123");
        userService.getUserBeans();
    }
}
