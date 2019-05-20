package com.wesly.selenium.car.operation;

import com.wesly.selenium.car.base.DriverBase;
import com.wesly.selenium.car.cases.LoginPage;

public class loginPagehandel {
    public DriverBase driver;
    public LoginPage loginpage;
    public loginPagehandel(DriverBase driver){
       this.driver = driver;
       loginpage = new LoginPage(driver);
    }
    /*
    * 输入登录用户名操作
    * */
    public void sendUserKey(String apply_user_account){
        loginpage.sendKeys(loginpage.getUserElement(),apply_user_account);
    }
    /*
    * 输入登录密码
    * **/
    public void sendPassWordkey(String pass_word){
        loginpage.sendKeys(loginpage.getPasswordElement(),pass_word);
    }
    /*
    * 点击登录按钮
    * */
    public void clickloginbtn(){
        loginpage.click(loginpage.getLoginBtn());
    }
}

