package com.wesly.httpclient.demo;

import java.util.Arrays;


/*

 */
public class Arrys {
    public static void main(String[] args) {
        int [] arrys1 = {2,11,3,7};
        //sort��������
        Arrays.sort(arrys1);
        System.out.println(Arrays.toString(arrys1));
        String str = "iuahwdooiawjdoijghuyesf";
        //ʹ��Arrays api ��һ������ַ����е������ַ��������У��������ӡ
        //string to array����,��toCharArray
        char[] chars= str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
