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
}
