package com.wesley.initdemo;

/**
 *
 *
 */
public class InitDemoTest {
    //属性
    private String name;
    int month;
    double weight;
    String species;
    //方法
    public  void run(){
        System.out.println("小猫快跑");
    }
    public void eat(){
        System.out.println("吃猫粮");
    }
    public void run(String name){
        this.eat();
        System.out.println(name+"快跑");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
