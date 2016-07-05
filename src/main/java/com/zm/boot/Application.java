package com.zm.boot;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric on 2016/6/27.
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan
@EnableAutoConfiguration
@ServletComponentScan
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        SpringApplication.run(Application.class,args);
    }
}
