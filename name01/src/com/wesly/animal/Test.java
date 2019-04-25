package com.wesly.animal;

public class Test {
        /**
         * 向上转型，隐式转型，自动转型
         * 父类引用指向子类型，可以调用子类重写父类的方法以及福来派生的方法，无法调用子类独有的方法
         * @param args
         */
        public static void main(String[] args) {
        Animal one = new Animal();
        one.show();
        Animal two = new Cat();
        two.show();
        Animal three = new Dog();
        three.show();
        System.out.println("-------------------------------------");
        /**
         * 向下转型
         * 子类引用指向父类对象，需要强制转换才能调用
         * instanceof 运算符，返回true/false
         */
        Cat temp = (Cat)two;
        temp.eat();
        temp.run();
    }
}
