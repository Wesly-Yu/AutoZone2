package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//������Ҫɨ��һ����
@SpringBootApplication
@ComponentScan("com.cource")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}
