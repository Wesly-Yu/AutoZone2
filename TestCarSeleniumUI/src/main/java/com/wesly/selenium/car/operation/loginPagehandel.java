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
    * �����¼�û�������
    * */
    public void sendUserKey(String apply_user_account){
        loginpage.sendKeys(loginpage.getUserElement(),apply_user_account);
    }
    /*
    * �����¼����
    * **/
    public void sendPassWordkey(String pass_word){
        loginpage.sendKeys(loginpage.getPasswordElement(),pass_word);
    }
    /*
    * �����¼��ť
    * */
    public void clickloginbtn(){
        loginpage.click(loginpage.getLoginBtn());
    }
}

