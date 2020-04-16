package com.igeek.egobuy.advice;


import cn.hutool.core.date.DateTime;
import cn.hutool.json.JSONUtil;
import com.igeek.egobuy.annotation.RecordSysLog;
import com.igeek.egobuy.pojo.SysLog;
import com.igeek.egobuy.service.SysLogService;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//切面类
@Aspect
@Component
@Log4j2
public class MyLogAspect {

    @Autowired
    private SysLogService sysLogService;

    //检测注解
    @Pointcut("@annotation(com.igeek.egobuy.annotation.RecordSysLog)")
    public void recordSysLog(){}

    @Pointcut("execution(public * com.igeek.egobuy.controller..*.*(..))")
    public void allController(){}

    @Around("recordSysLog()")
    public Object recordSysLogController(ProceedingJoinPoint proceedingJoinPoint) {
        Object proceed = null;
        try {
            //前置通知
            //controller的方法
            MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
            Method method = signature.getMethod();
            //反射
            RecordSysLog recordSysLog = method.getAnnotation(RecordSysLog.class);
            SysLog sysLog = null;
            if(recordSysLog!=null){
                String value = recordSysLog.value();
                sysLog = new SysLog();
                sysLog.setUseraction(value);
                sysLog.setCreatetime(new DateTime());
            }
            proceed = proceedingJoinPoint.proceed();
            //后置通知
            boolean save = sysLogService.save(sysLog);
            System.out.println(sysLog);
        } catch (Throwable throwable) {
            //异常通知
            throw new RuntimeException(throwable);
        } finally {
            //最终通知
        }
        return proceed;
    }

    @Around("allController()")
    public Object logController(ProceedingJoinPoint proceedingJoinPoint) {
        Object proceed = null;
        StringBuilder sb = new StringBuilder();
        String className = null;
        String methodName = null;
        String arg = null;
        long start = 0;
        try {
            //前置通知
            //类名
            className = proceedingJoinPoint.getTarget().getClass().getName();
            //controller的方法
            MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
            Method method = signature.getMethod();
            //controller的方法名
            methodName = method.getName();
            //参数
            Object[] args = proceedingJoinPoint.getArgs();
            arg = JSONUtil.toJsonStr(args);
            //执行之前的时间
            start = System.currentTimeMillis();
            proceed = proceedingJoinPoint.proceed();
            //后置通知
            long end = System.currentTimeMillis();
            long time = end - start;
            sb.append("类名:").append(className)
                    .append(",方法名:").append(methodName)
                    .append(",参数:").append(arg)
                    .append(",执行时间:").append(time);
            log.info(sb.toString());
        } catch (Throwable throwable) {
            //异常通知
            long end = System.currentTimeMillis();
            long time = end - start;
            sb.append("类名:").append(className)
                    .append(",方法名:").append(methodName)
                    .append(",参数:").append(arg)
                    .append(",执行时间:").append(time)
                    .append(",错误信息:").append(throwable.getMessage())
            ;
            log.error(sb.toString());
            throw new RuntimeException(throwable);
        } finally {
            //最终通知
        }
        return proceed;
    }

}
