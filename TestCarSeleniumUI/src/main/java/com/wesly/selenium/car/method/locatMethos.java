package com.wesly.selenium.car.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatMethos {
    public WebDriver driver;
    public void InitDriver(){
        System.setProperty("webdriver.chrome,driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        String url="http://car.schouqin.gov.cn:16002/index";
        driver.get(url);
        driver.manage().window().maximize();
    }
    public  void findElementById(WebElement ID){
        driver.findElement(By.id(""));
    }
}
