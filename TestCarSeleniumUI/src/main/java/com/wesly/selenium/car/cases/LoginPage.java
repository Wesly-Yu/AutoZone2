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
     * ��ȡ�û����������
     * */
    public WebElement getUserElement(){
        return element(getLocator.getLocator("apply_user_account"));
    }
    /*
    *
    * ��ȡ���������element
    * **/
    public WebElement getPasswordElement(){
        return  element(getLocator.getLocator("pass_word"));
    }
}
