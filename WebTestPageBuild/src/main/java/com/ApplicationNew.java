package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//表明需要扫描一个类
@SpringBootApplication
@ComponentScan("com.cource")
public class ApplicationNew {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationNew.class,args);

    }
}
