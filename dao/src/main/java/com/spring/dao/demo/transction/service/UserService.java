package com.spring.dao.demo.transction.service;

import com.spring.dao.demo.transction.UserBean;

import java.util.List;

/**
 * @author zzp
 * @date 2020/7/17
 */
public interface UserService {

    void add(UserBean userBean);

    void modify(UserBean userBean);

    UserBean getUserBean(String username,String password);

    List<UserBean> getUserBeans();
}
