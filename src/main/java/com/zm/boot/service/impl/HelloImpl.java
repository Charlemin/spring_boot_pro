package com.zm.boot.service.impl;

import org.springframework.stereotype.Component;

/**
 * Created by Eric on 2016/6/30.
 */
@Component("hello")
public class HelloImpl {

    public void foo(){
        System.out.println("执行hello组件的foo方法");
    }

    public void addUser(String name,String pass){
        System.out.println("执行hello组件的adduser方法添加用户：" + name);

    }
}
