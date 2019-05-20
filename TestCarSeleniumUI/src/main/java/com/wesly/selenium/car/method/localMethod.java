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
     * ��λElement
     * @param  by
     *
     * **/
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /**
     *
     * ��װclick
     * **/
    public  void click(WebElement element){
        if (element !=null){
            element.click();
        }else {
            System.out.println("Ԫ�ز�����");
        }
    }
    /**
     * ��װ����
     * **/
    public void sendKeys(WebElement element,String value){
        if (element !=null){
            element.sendKeys();
        }else {
            System.out.println("Ԫ�ض�λ������");
        }
    }
    /**
     *
     * ��װ�ж��Ƿ����
     * **/
    public boolean isDisplay(WebElement element){
        return element.isDisplayed();
    }
}
