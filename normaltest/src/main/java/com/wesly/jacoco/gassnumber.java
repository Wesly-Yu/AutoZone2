package com.wesly.jacoco;

import java.util.Random;
import java.util.Scanner;

public class gassnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randNum = r.nextInt(100)+1;
        System.out.println("输入你猜测的数字");
        while(true){
            int gussNum = sc.nextInt();
            if (gussNum>randNum){
                System.out.println("嗯，你猜测试的数字比实际的数字大");
            }
            else if (gussNum<randNum){
                System.out.println("嗯，你猜测的数字比实际的数字小");
            }
            else {
                System.out.println("厉害了，猜中了");
                break;
            }
        }


    }
}
