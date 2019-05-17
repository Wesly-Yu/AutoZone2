package com.wesly.selenium.car.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Login {
    public WebDriver driver;
    ResourceBundle resource = ResourceBundle.getBundle("data");
    String apply_account = resource.getString("apply_user_account");
    String password = resource.getString("pass_word");
    public void InitDriver(){
        System.setProperty("webdriver.chrome,driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        String url="http://car.schouqin.gov.cn:16002/index";
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void loginCarManagerment() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("name"));
        username.sendKeys("sj_sqr");
        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("a12345678");
        WebElement login_btn = driver.findElement(By.xpath("/html/body/div/div[4]/form/button"));
        login_btn.click();
        Thread.sleep(3000);
//        Actions actions = new Actions(driver);
        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
        Login loginstep = new  Login();
        loginstep.InitDriver();
        loginstep.loginCarManagerment();

    }
}
