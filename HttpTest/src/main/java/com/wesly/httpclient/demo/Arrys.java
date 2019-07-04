package com.wesly.httpclient.demo;

import java.util.Arrays;


/*

 */
public class Arrys {
    public static void main(String[] args) {
        int [] arrys1 = {2,11,3,7};
        //sort升序排列
        Arrays.sort(arrys1);
        System.out.println(Arrays.toString(arrys1));
        String str = "iuahwdooiawjdoijghuyesf";
        //使用Arrays api 将一个随机字符串中的所有字符升序排列，并倒序打印
        //string to array数组,用toCharArray
        char[] chars= str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
