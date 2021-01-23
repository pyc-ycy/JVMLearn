package com.pyc.CP3;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file StackFrameTest
 * @pack com.pyc.CP3
 * @date 2021/1/23
 * @time 21:11
 * @E-mail 2923616405@qq.com
 **/

// 体验栈帧的入栈和出栈
public class StackFrameTest {
    public static void main(String[] args) {
        System.out.println("main method start to run");
        StackFrameTest st = new StackFrameTest();
        st.method1();
        System.out.println("main method run stop");
    }
    public void method1(){
        System.out.println("method1() start run ...");
        method2();
        System.out.println("method1() finish ...");
    }

    private int method2() {
        System.out.println("method2() start run ...");
        int i =10;
        double m = method3();
        System.out.println("method2() will finish soon ...");
        return  i + (int)m;
    }

    private double method3() {
        System.out.println("method3() start run ...");
        double j = 20.0;
        System.out.println("method3() will finish soon ...");
        return j;
    }
}
