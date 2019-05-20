package com.wesly.selenium.car.business;

import com.wesly.selenium.car.base.DriverBase;
import com.wesly.selenium.car.operation.loginPagehandel;
import org.testng.annotations.Test;

public class LoginPro {
    public loginPagehandel lph;
    public LoginPro(DriverBase driver){
       lph = new loginPagehandel(driver);
    }
    @Test
    public void login(String username,String password){
        lph.sendUserKey(username);
        lph.sendPassWordkey(password);
        lph.clickloginbtn();
    }
}
