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
        BeanDemo BD1 = (BeanDemo)applicationContext.getBean("bean1");
        BeanDemo BD2 = (BeanDemo)applicationContext.getBean("bean1");
        System.out.println(BD1); //默认单例模式  地址一致
        System.out.println(BD2);

        //关闭工厂模式用于实现bean 配置的销毁方法
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
