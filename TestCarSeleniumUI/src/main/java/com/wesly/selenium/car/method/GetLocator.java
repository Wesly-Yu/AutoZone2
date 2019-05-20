package com.wesly.selenium.car.method;

import org.openqa.selenium.By;

import java.util.ResourceBundle;

public class GetLocator {
    public static By GetLocator(String key){
        ResourceBundle resource = ResourceBundle.getBundle("data");
        String locator = resource.getString(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if (locatorType.equals("id")){

        }
    }
}
