package com.spring.bean.cases;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/*
*
* Bean实例化的三种方式
* **/
public class SpringDemo1 {
    @Test
    public void testDemo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanDemo BD = (BeanDemo)applicationContext.getBean("bean1");
    }
}
