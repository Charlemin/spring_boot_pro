package com.zm.boot;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by Eric on 2016/6/28.
 */
public class LogTest {

    private static Logger logger = Logger.getLogger(LogTest.class.getName());
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        System.out.println("this is println message");
        logger.info("this is log info");
        logger.debug("this is debug info");
        logger.error("this is error info");

    }
}
