package com.wesley.initdemo;

public class MoocLearn {
    private String name;
    public MoocLearn(){
        this.name ="小心";
    }
    public MoocLearn(String name){
        this.name = name;
        System.out.println("我是"+this.name);
    }

    public static void main(String[] args) {
        MoocLearn test = new MoocLearn("小琴");
    }
}

