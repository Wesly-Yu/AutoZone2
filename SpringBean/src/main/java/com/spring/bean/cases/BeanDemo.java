package com.spring.bean.cases;


import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Data
public class BeanDemo implements BeanNameAware, ApplicationContextAware {
    String name;
    public BeanDemo(){
        System.out.println(name);
    }
    public void demo2(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public void setBeanName(String s) {

    }



    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

}
