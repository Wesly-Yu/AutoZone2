package com.wesly.animal;

public class Master {
//    public void feed(Cat cat){
//        cat.eat();
//        cat.playBall();
//    }
//    public void feed(Dog dog){
//        dog.eat();
//        dog.sleep();
//    }
    /**
     * 方案2
     * 编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
     */
    public void feed(Animal animal){
        if (animal instanceof Cat){
            Cat temp = (Cat)animal;
            temp.eat();
            temp.playBall();
        }else if (animal instanceof Dog){
            Dog temp = (Dog)animal;
            temp.eat();
            temp.sleep();
        }
    }
}
