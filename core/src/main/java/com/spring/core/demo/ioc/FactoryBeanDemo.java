package com.spring.core.demo.ioc;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zzp
 * @date 2020/7/8
 */
public class FactoryBeanDemo implements FactoryBean<FactoryBeanEntity> {

    @Override
    public FactoryBeanEntity getObject() throws Exception {
        return new FactoryBeanEntity();
    }

    @Override
    public Class<FactoryBeanEntity> getObjectType() {
        return FactoryBeanEntity.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
