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
}
