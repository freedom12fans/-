package com.igeek.egobuy.controller;

import com.igeek.egobuy.exception.MyException;
import com.igeek.egobuy.pojo.User;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Controller
@Validated
public class TestController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/testError/{id}")
    public String testError(@PathVariable("id") int id){
        if(id>1000){
            throw new MyException("id不能超过1000!",1);
        }
        return "success";
    }

    @GetMapping("/testValidate")
    @ResponseBody
    public String testValidate(@Validated User user/*, BindingResult result*/, @NotBlank(message = "aaa不能为空") String aaa){
   /*     List<ObjectError> allErrors = result.getAllErrors();
        for (ObjectError err : allErrors) {
            FieldError err1 = (FieldError)err;
            String fieldName = err1.getField();
            String defaultMessage = err1.getDefaultMessage();
            System.out.println(fieldName +"\t"+ defaultMessage);
        }*/
        System.out.println(user);
        return "success";
    }
}
