package com.spring.core.demo.type;

import java.beans.PropertyEditorSupport;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class ExoticTypeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new ExoticType(text));
    }
}
