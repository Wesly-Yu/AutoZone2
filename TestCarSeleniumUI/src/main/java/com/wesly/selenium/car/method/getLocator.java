package com.wesly.selenium.car.method;
import org.openqa.selenium.By;
import java.util.ResourceBundle;


public class getLocator {
    public static By getLocator(String key){
        ResourceBundle resource = ResourceBundle.getBundle("data");
        String locator = resource.getString(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if (locatorType.equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("claname")){
            return By.className(locatorValue);
        }else if (locatorType.equals("xpath")){
            return By.xpath(locatorValue);
        }else if (locatorType.equals("css")){
            return By.cssSelector(locatorValue);
        }else if (locatorType.equals("linkText")){
            return By.linkText(locatorValue);
        }
        return By.tagName(locatorValue);
    }
}
