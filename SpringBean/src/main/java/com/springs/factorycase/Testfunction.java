package com.springs.factorycase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

public class Testfunction {
    @Test
    public void demo1(){
        USerservice userservice = new UserServiceimp();
        userservice.sayHello();
    }
    /*
     * Spring ioc
     *
     * **/
    @Test
    public void demo2(){
        //ʹ��Spring�Ĺ���
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ͨ�����������,�����˷�����.
        USerservice userservice = (USerservice) applicationContext.getBean("user");
        userservice.sayHello();

    }
    @Test
    public void demo3(){
        //ʹ��Spring�Ĺ���
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("f:\\applicationContext.xml");
        //ͨ�����������,�����˷�����.
        USerservice userservice = (USerservice) applicationContext.getBean("user");
        userservice.sayHello();

    }
}

