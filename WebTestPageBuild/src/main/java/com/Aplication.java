package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//������Ҫɨ��һ����
@ComponentScan("com.cource.server")

public class Aplication {
    public static void main(String[] args) {
        SpringApplication.run(Aplication.class,args);

    }
}
