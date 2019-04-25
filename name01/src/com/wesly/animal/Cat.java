package com.wesly.animal;

public class Cat extends Animal{
    private double weight;
    public Cat(){

    }
    public Cat(String name,int month,double weight){
        super(name, month);
        this.weight =weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void run(){
        System.out.println("代码测试中");
    }
    //重写父类方法
    @Override
    public void eat() {
        System.out.println("代码白盒测试中");
    }
    @Override
    public void show(){
        System.out.println("我是猫咪");
    }

    public void playBall() {
        System.out.println("猫咪喜欢玩线球");
    }
}
