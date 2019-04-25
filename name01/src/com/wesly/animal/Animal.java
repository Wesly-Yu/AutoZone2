package com.wesly.animal;

public class Animal {
    private String name;
    private int month;
    public Animal(){

    }
    public Animal(String name,int month){
        this.name = name;
        this.month = month;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void eat(){
        System.out.println("动物都需要吃东西");
    }
    public void show(){
        System.out.println("我是动物");
    }
}

