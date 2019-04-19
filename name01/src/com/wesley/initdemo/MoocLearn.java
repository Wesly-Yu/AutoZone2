package com.wesley.initdemo;
import com.wesley.initdemo.*;
public class MoocLearn {
    private int add(int a,int b){
        return a+b;
    }
    private int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MoocLearn test = new MoocLearn();
        System.out.println(test.add(1,2)+test.add(3,4,5));
    }
}

