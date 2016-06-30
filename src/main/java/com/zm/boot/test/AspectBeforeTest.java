package com.zm.boot.test;

import com.zm.boot.service.impl.HelloImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Eric on 2016/6/30.
 */
public class AspectBeforeTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans_aop.xml");
//        System.out.println(java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
        HelloImpl hello = ctx.getBean("hello",HelloImpl.class);
        //LogAspect logAspect = ctx.getBean("logAspect",LogAspect.class);
        //if(logAspect == null)
        hello.foo();
    }
}
