package com.springs.factorycase;

public class UserServiceimp  implements USerservice{
    String user;
    public void sayHello() {
        System.out.println("Hello word");
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
