package com.wesly.jacoco;

import java.util.Random;
import java.util.Scanner;

public class gassnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randNum = r.nextInt(100)+1;
        System.out.println("������²������");
        while(true){
            int gussNum = sc.nextInt();
            if (gussNum>randNum){
                System.out.println("�ţ���²��Ե����ֱ�ʵ�ʵ����ִ�");
            }
            else if (gussNum<randNum){
                System.out.println("�ţ���²�����ֱ�ʵ�ʵ�����С");
            }
            else {
                System.out.println("�����ˣ�������");
                break;
            }
        }


    }
}
