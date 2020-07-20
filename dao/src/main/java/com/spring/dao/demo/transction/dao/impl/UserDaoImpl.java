package com.spring.dao.demo.transction.dao.impl;

import com.spring.dao.demo.transction.UserBean;
import com.spring.dao.demo.transction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author zzp
 * @date 2020/7/20
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int add(UserBean userBean) {
        return this.jdbcTemplate.update("insert into tb_user(username,password) values (?,?)",
                userBean.getUsername(), userBean.getPassword());
    }

    @Override
    public int update(UserBean userBean) {
        return this.jdbcTemplate.update("update set password=? where username=?",
                userBean.getPassword(),userBean.getUsername());
    }

    @Override
    public int delete(String username) {
        return 0;
    }

    @Override
    public UserBean selectByUsername(String username) {
        return jdbcTemplate.queryForObject("select * from tb_user where username=?",
                (result,raw)->{
            UserBean userBean = new UserBean();
            userBean.setId(result.getInt("id"));
            userBean.setUsername(result.getString("username"));
            userBean.setPassword(result.getString("password"));
            return  userBean;
        },username);
    }

    @Override
    public int count() {
        return this.jdbcTemplate.queryForObject("select count(username) from tb_user",Integer.class);
    }

    @Override
    public List<UserBean> selectAll() {
        return jdbcTemplate.query("select * from tb_user where username=?",
                (result,raw)->{
                    UserBean userBean = new UserBean();
                    userBean.setId(result.getInt("id"));
                    userBean.setUsername(result.getString("username"));
                    userBean.setPassword(result.getString("password"));
                    return  userBean;
                });
    }
}
