package com.igeek.egobuy.advice;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {
    //在控制器方法调用之前运行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(handler.getClass().getName());
        System.out.println("-----------------------------");
        System.out.println("preHandle");
        if (handler instanceof HandlerMethod) {
            System.out.println(((HandlerMethod) handler).getBean().getClass().getName());
            System.out.println(((HandlerMethod) handler).getMethod().getName());
        }
        long l = System.currentTimeMillis();
        System.out.println("startTime: " + l);
        System.out.println("-----------------------------");
        request.setAttribute("startTime", l);
        return true;
    }

    //在控制器方法调用成功之后运行  出错抛出异常  则不走
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("-----------------------------");
        System.out.println("postHandle");
        if (handler instanceof HandlerMethod) {
            System.out.println(((HandlerMethod) handler).getBean().getClass().getName());
            System.out.println(((HandlerMethod) handler).getMethod().getName());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("endTime: " + endTime);
        long startTime = (long) request.getAttribute("startTime");
        System.out.println("总耗时:" + (endTime - startTime));
        System.out.println("-----------------------------");
    }

    //方法被动用或者抛出异常都会被运行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("-----------------------------");
        System.out.println("afterCompletion");
        if (handler instanceof HandlerMethod) {
            System.out.println(((HandlerMethod) handler).getBean().getClass().getName());
            System.out.println(((HandlerMethod) handler).getMethod().getName());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("endTime: " + endTime);
        long startTime = (long) request.getAttribute("startTime");
        System.out.println("总耗时:" + (endTime - startTime));
        System.out.println("-----------------------------");
    }
}
