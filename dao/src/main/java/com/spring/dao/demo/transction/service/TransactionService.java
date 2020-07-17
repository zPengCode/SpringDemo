package com.spring.dao.demo.transction.service;

import com.spring.dao.demo.transction.anno.AccountTx;
import com.spring.dao.demo.transction.anno.OrderTx;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zzp
 * @date 2020/7/17
 */

public class TransactionService {

    @OrderTx
    public void doSomething1(){

    }

    @AccountTx
    public void doSomething2(){}
}
