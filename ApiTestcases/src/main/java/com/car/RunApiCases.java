package com.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //通过@EnableScheduling注解开启对计划任务的支持
@SpringBootApplication
public class RunApiCases {
    public static void main(String[] args) {
        SpringApplication.run(RunApiCases.class,args);
    }
}
