package com.wesly.selenium.car.cases;

import com.wesly.selenium.car.base.DriverBase;
import com.wesly.selenium.car.method.getLocator;
import com.wesly.selenium.car.method.localMethod;
import org.openqa.selenium.WebElement;

public class LoginPage extends localMethod {
    public LoginPage(DriverBase driver){
        super(driver);

    }
    /**
     * 获取用户名和输入框
     * */
    public WebElement getUserElement(){
        return element(getLocator.getLocator("apply_user_account"));
    }
    /*
    *
    * 获取密码输入框element
    * **/
    public WebElement getPasswordElement(){
        return  element(getLocator.getLocator("pass_word"));
    }
    /*
    * 登录按键
    * **/
    public WebElement getLoginBtn(){
        return  element(getLocator.getLocator("loginbtn"));
    }
    /*
    * 记住密码
    * */
    public WebElement getAutologinbtn(){
        return element(getLocator.getLocator("remember-input"));
    }
}
