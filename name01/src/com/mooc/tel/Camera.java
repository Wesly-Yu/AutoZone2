package com.mooc.tel;

public class Camera implements IPhoto{

    @Override
    public void photo() {
        System.out.println("可以拍照");
    }
}
