package com.spring_aop;

public class UserDaoimpl implements UserDao{

    public void add() {
        System.out.println("���");
    }

    public void find() {
        System.out.println("����");
    }

    public void update() {
        System.out.println("�޸�");
    }

    public void delete() {
        System.out.println("ɾ��");
    }
}
