package controller;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Repository("testerValidator")
public class TesterValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ValidationTester.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "loginname", null, "登录名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");
        ValidationTester tester = (ValidationTester)target;
        if(tester.getLoginname().length()>10){
            errors.rejectValue("loginname", null, "用户名过长");
        }
        if(tester.getPassword().length()<8){
            errors.rejectValue("password", null, "密码太短");
        }
    }
}
