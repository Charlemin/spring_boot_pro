package com.zm.boot.test;

import org.junit.Test;

/**
 * Created by Eric on 2016/7/1.
 */
public class ClassLoaderTest {

    @Test
    public void getClassLoader(){
        System.out.println(ClassLoaderTest.class.getClassLoader());
    }
}
