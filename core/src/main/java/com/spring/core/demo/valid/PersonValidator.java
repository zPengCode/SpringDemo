package com.spring.core.demo.valid;

import com.spring.core.demo.valid.entity.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author zzp
 * @date 2020/7/13
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName","firstName不能为空");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"lastName","spring.valid.is_empty",new String[]{"lastName"});
        System.out.println(o);
    }
}
