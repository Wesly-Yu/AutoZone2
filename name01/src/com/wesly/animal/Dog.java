package com.wesly.animal;

public class Dog extends Animal{
    private String sex;
    public Dog(){

    }
    public Dog(String name,int month,String sex){
        this.setMonth(month);
        this.setName(name);
        this.setSex(sex);

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void sleep(){
        System.out.println("代码睡眠状态");
    }

    @Override
    public void eat() {
        System.out.println("狗狗要吃肉");
    }
    @Override
    public void show(){
        System.out.println("我是狗狗");
    }
}
