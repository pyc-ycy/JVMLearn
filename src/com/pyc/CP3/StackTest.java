package com.pyc.CP3;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file StackTest
 * @pack com.pyc.CP3
 * @date 2021/1/23
 * @time 20:06
 * @E-mail 2923616405@qq.com
 **/


public class StackTest {
    public static void main(String[] args) {
        StackTest t = new StackTest();
        t.methodA();    // 由于主线程调用了方法A
    }

    public void methodA(){
        int i = 20;
        int j = 30;
        methodB(); // 方法A由调用了方法B
    }
    // 因此方法B在当前线程的虚拟机栈的栈顶，即方法B此时是“当前方法”。
    public void methodB(){
        int k = 60;
        int m = 80;
    }
}
