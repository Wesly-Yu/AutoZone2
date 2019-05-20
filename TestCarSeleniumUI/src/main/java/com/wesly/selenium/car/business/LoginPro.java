package com.wesly.selenium.car.business;

import com.wesly.selenium.car.base.DriverBase;
import com.wesly.selenium.car.operation.loginPagehandel;

public class LoginPro {
    public loginPagehandel lph;
    public LoginPro(DriverBase driver){
       lph = new loginPagehandel(driver);
    }
    public void login(String username,String password){
        lph.sendUserKey(username);
        lph.sendPassWordkey(password);
        lph.clickloginbtn();
    }
}
