package com.spring.dao.demo.transction.dao;

import com.spring.dao.demo.transction.UserBean;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * 可重用的查询
 * @author zzp
 * @date 2020/7/20
 */
public class UserMappingQuery extends MappingSqlQuery<UserBean> {

    public UserMappingQuery(DataSource ds) {
        super(ds,"select * from user where username=?");
        declareParameter(new SqlParameter("username", Types.VARCHAR));
        compile();
    }

    @Override
    protected UserBean mapRow(ResultSet resultSet, int i) throws SQLException {
        UserBean userBean = new UserBean();
        userBean.setId(resultSet.getInt("id"));
        userBean.setUsername(resultSet.getString("username"));
        userBean.setPassword(resultSet.getString("password"));
        return userBean;
    }
}
