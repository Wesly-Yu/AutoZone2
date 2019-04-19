package com.wesley.initdemo;

public class CatTest {
    public static void main(String[] args) {
        InitDemoTest one = new InitDemoTest();
        one.run();
        one.eat();
        one.name="撒撒";
        one.run(one.name);
    }
}
