package com.wesly.selenium.car.method;

import com.wesly.selenium.car.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class localMethod {
    public DriverBase driver;
    public localMethod(DriverBase driver){
        this.driver = driver;
    }

    /**
     * 定位Element
     * @param  by
     *
     * **/
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /**
     *
     * 封装click
     * **/
    public  void click(WebElement element){
        if (element !=null){
            element.click();
        }else {
            System.out.println("元素不存在");
        }
    }
    /**
     * 封装输入
     * **/
    public void sendKeys(WebElement element,String value){
        if (element !=null){
            element.sendKeys();
        }else {
            System.out.println("元素定位不存在");
        }
    }
    /**
     *
     * 封装判断是否存在
     * **/
    public boolean isDisplay(WebElement element){
        return element.isDisplayed();
    }
}
