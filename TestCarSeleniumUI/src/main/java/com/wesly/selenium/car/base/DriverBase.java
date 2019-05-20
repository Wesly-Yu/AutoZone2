package com.wesly.selenium.car.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverBase {
    public  WebDriver driver;
    public DriverBase(String browserName){
        SelectDriver Driver = new  SelectDriver();
        this.driver = Driver.driverName(browserName);
    }

    public void stop(){
        driver.close();
    }

    /**
     *
     * ·â×°findelement
     * */
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
}

