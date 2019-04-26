package com.mooc.tel;

//接口访问修饰符：public or default
public interface INet {
    //接口中抽象方法可以不写abstract关键字
    //接口方法中默认访问修饰符为:public
    public void network();
    //接口中可以包含常量，默认为public static final
    int TEMP=20;
}
