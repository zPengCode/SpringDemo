package com.spring.dao.demo.transction.dao.impl;

import com.spring.dao.demo.transction.UserBean;
import com.spring.dao.demo.transction.dao.UserDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    ApplicationContext context;
    UserDao userDao;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        userDao = context.getBean("userDao",UserDaoImpl.class);
        System.out.println(userDao);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        UserBean userBean = new UserBean("123","456");
        assert userDao.add(userBean) == 1;
    }

    @Test
    public void update() {
        UserBean userBean = new UserBean("123","123");
        assert userDao.update(userBean) == 1;
    }

    @Test
    public void delete() {
    }

    @Test
    public void selectByUsername() {
    }

    @Test
    public void count() {
    }

    @Test
    public void selectAll() {
    }
}