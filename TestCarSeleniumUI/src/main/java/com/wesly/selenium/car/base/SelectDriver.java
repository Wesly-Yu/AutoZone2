package com.wesly.selenium.car.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SelectDriver {
    WebDriver driver;
    public WebDriver driverName(String browserName){
        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.firfox.marionette","E:\\selenium-driver\\chromedriver.exe");
            return new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.firfox.marionette","E:\\selenium-driver\\geckodriver.exe");
            return new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase("opera")){
            System.setProperty("webdriver.opera.driver","E:\\selenium-driver\\operadriver.exe");
            return new OperaDriver();
        }
        System.setProperty("webdriver.ie.driver","E:\\selenium-driver\\IEDriverServer.exe");
        return new InternetExplorerDriver();
    }

}
