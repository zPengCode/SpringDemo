package com.spring.dao.demo.transction.dao.impl;

import com.spring.dao.demo.transction.UserBean;
import com.spring.dao.demo.transction.dao.UserDao;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zzp
 * @date 2020/7/20
 */
public class NameUserDaoImpl implements UserDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setNamedParameterJdbcTemplate(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public int add(UserBean userBean) {
        SqlParameterSource na = new BeanPropertySqlParameterSource(userBean);
        return namedParameterJdbcTemplate.update("insert into (username,password) values(:username,:password)",na);
    }

    @Override
    public int update(UserBean userBean) {
        String sql = "update tb_user set password=:password where username=:username";
        Map values;
        Map<String, String> param = new HashMap<>(2);
        param.put("username",userBean.getUsername());
        param.put("password",userBean.getPassword());
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource(param);
        return namedParameterJdbcTemplate.update(sql, sqlParameterSource);
    }

    @Override
    public int delete(String username) {
        return 0;
    }

    @Override
    public UserBean selectByUsername(String username) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<UserBean> selectAll() {
        return null;
    }
}
