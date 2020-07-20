package com.spring.dao.demo.transction.dao;

import com.spring.dao.demo.transction.UserBean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author zzp
 * @date 2020/7/20
 */
public interface UserDao {

    int add(UserBean userBean);

    int update(UserBean userBean);

    int delete(String username);

    UserBean selectByUsername(String username);

    int count();

    List<UserBean> selectAll();
}
