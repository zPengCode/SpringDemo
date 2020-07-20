package com.spring.dao.demo.transction.service.impl;

import com.spring.dao.demo.transction.UserBean;
import com.spring.dao.demo.transction.service.ProgramUserService;
import com.spring.dao.demo.transction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.io.IOException;
import java.util.List;

/**
 * @author zzp
 * @date 2020/7/20
 */
public class ProgramUserServiceImpl implements ProgramUserService {


    private final TransactionTemplate transactionTemplate;


    public ProgramUserServiceImpl(PlatformTransactionManager transactionManager){
        this.transactionTemplate = new TransactionTemplate(transactionManager);
    }

    @Override
    public Object doSomeService1(final UserBean userBean) {
        return transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                try{
                    if(findUser(userBean.getUsername(),userBean.getPassword()) != null){
                        return update(userBean);
                    }else{
                        throw new Exception("add error ");
//                        return add(userBean);
                    }
                }catch (Exception e){
                    transactionStatus.setRollbackOnly();
                    return -1;
                }
            }
        });
    }

    @Override
    public void doSomeService2() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                updateStatus();
            }
        });
    }

    @Override
    public int add(UserBean userBean) {
        System.out.println("ProgramUserService add");
        return 0;
    }

    @Override
    public int update(UserBean userBean) {
        System.out.println("ProgramUserService update");
        return 0;
    }

    @Override
    public UserBean findUser(String username, String password) {
        System.out.println("ProgramUserService findUser");
        return null;
    }

    @Override
    public void updateStatus() {
        System.out.println("ProgramUserService updateStatus");
    }
}
