package com.igeek.egobuy.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        //系统自己的一些错误信息
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        //从request中取信息
        Map<String, Object> data = (Map<String, Object>) webRequest.getAttribute("data", 0);
        String msg = (String) webRequest.getAttribute("msg", 0);
        errorAttributes.put("data", data);
        errorAttributes.put("msg", msg);
        return errorAttributes;
    }
}
