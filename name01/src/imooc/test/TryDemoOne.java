package imooc.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TryDemoOne {
    public static void main(String[] args) {
        int result = test();
        System.out.println("one和two的商是:" + result);
    }

    public static int test() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====运算开始=====");
        try {
            System.out.println("请输入第一个数");
            int one = input.nextInt();
            System.out.println("请输入第二个数");
            int two = input.nextInt();
            return one / two;
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为0");
            e.printStackTrace();
            return 0;
        } finally {
            System.out.println("=====运算结束=====");
        }

    }
}
