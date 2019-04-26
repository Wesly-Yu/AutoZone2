package com.mooc.tel;

public class TelPhone {
    private String band;
    private int price;
    public void TelPhone(){
    }
    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void call(){
        System.out.println("手机拨打电话");
    }
}
