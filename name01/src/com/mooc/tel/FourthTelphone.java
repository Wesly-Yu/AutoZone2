package com.mooc.tel;

public class FourthTelphone extends ThirdTelphone implements IPhoto{
//    public void takephoto(){
//        System.out.println("拍照");
//    }
    public void playgame(){
        System.out.println("玩游戏");
    }
    public void surfinternet(){
        System.out.println("上网");
    }

    @Override
    public void photo() {
        System.out.println("拍照功能");

    }
}
