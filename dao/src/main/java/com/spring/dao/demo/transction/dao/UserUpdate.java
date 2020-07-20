package com.spring.dao.demo.transction.dao;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * @author zzp
 * @date 2020/7/20
 */
public class UserUpdate extends SqlUpdate {

    public UserUpdate(DataSource ds) {
        super(ds, "update tb_user set password=? where username=? ");
        declareParameter(new SqlParameter("username", Types.VARCHAR));
        declareParameter(new SqlParameter("password", Types.VARCHAR));
        compile();
    }

    public int execute(String username,String password){
        return update(username,password);
    }
}
