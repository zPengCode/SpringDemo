package com.spring.dao.demo.transction.service;

import com.spring.dao.demo.transction.UserBean;

/**
 * @author zzp
 * @date 2020/7/20
 */
public interface ProgramUserService {

    Object doSomeService1(UserBean userBean);

    void doSomeService2();

    int add(UserBean userBean);

    int update(UserBean userBean);

    UserBean findUser(String username,String password);

    void updateStatus();
}
