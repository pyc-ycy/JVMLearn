package com.pyc.CP02;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file ClassInitTest
 * @pack com.pyc.CP02
 * @date 2021/1/19
 * @time 20:38
 * @E-mail 2923616405@qq.com
 **/


public class ClassInitTest {
    // 类在初始化时，编译器会自动根据变量声明和赋值语句，生成一个clinit方法
    private static int num = 1;
    static {
        num = 2;
        number = 20;
        // System.out.println(number)   此处调用number会发生非法前向引用错误
        // 也就是说，一个变量可以在声明前进行赋值，但不可进行调用，与C/C++的变量在声明之前既不可以赋值也不可以调用不同
    }
    private static int number = 10; // linking 之前 prepare 阶段 number = 0 --》 init：20--> 10
    public static void main(String[] args) {
        System.out.println(ClassInitTest.num+ClassInitTest.number);
    }
}
