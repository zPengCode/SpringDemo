package com.spring.dao.demo.transction.service.impl;

import com.spring.dao.demo.transction.UserBean;
import com.spring.dao.demo.transction.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzp
 * @date 2020/7/17
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add(UserBean userBean) {
        System.out.println("add UserBean :" + userBean);
    }

    @Override
    public void modify(UserBean userBean) {
        System.out.println("modify UserBean :" + userBean);
    }

    @Override
    public UserBean getUserBean(String username, String password) {
        System.out.println("getUserBean : username = " + username + ",password = " + password);
        return new UserBean(username,password);
    }

    @Override
    public List<UserBean> getUserBeans() {
        List<UserBean> userBeans = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserBean userBean = new UserBean("username-"+i,"passwor-"+i);
            userBeans.add(userBean);
        }
        return userBeans;
    }
}
