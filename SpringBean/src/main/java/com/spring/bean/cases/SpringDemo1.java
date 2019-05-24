package com.spring.bean.cases;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/*
*
* Beanʵ���������ַ�ʽ
* **/
public class SpringDemo1 {
    @Test
    public void testDemo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanDemo BD1 = (BeanDemo)applicationContext.getBean("bean1");
        BeanDemo BD2 = (BeanDemo)applicationContext.getBean("bean1");
        System.out.println(BD1); //Ĭ�ϵ���ģʽ  ��ַһ��
        System.out.println(BD2);

        //�رչ���ģʽ����ʵ��bean ���õ����ٷ���
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
