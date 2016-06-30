package com.zm.boot.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Eric on 2016/6/30.
 */
@Aspect
public class LogAspect {

    @Before("execution(com.zm.boot.aspectj.*)")
    public void authority(){
        System.out.println("模拟执行权限检查");
    }
}
