package com.wesly.test;
import com.wesly.animal.Master;
import com.wesly.animal.Cat;
import com.wesly.animal.Dog;
public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();
        master.feed(one);
        master.feed(two);
    }
}
