package com.igeek.egobuy.advice;

import com.igeek.egobuy.exception.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

//该类是controller的增强类
@ControllerAdvice
public class MyExceptionHandler {

/*    @ExceptionHandler(MyException.class)
    @ResponseBody
    //自定义浏览器返回状态码
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handlerException(MyException mye){
        Map<String, Object> map = new HashMap<>();
        map.put("code",mye.getCode());
        map.put("message",mye.getMessage());
        return map;
    }*/
    //全局异常的处理
    @ExceptionHandler(MyException.class)
    public String handlerException(MyException mye, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", mye.getCode());
        map.put("message", mye.getMessage());
        request.setAttribute("msg", "出错了");
        request.setAttribute("data", map);
        //手动设置浏览器状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        return "forward:/error";
    }

}
