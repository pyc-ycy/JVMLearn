package com.pyc.CP3;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file DynamicLinkTest
 * @pack com.pyc.CP3
 * @date 2021/1/27
 * @time 19:27
 * @E-mail 2923616405@qq.com
 **/


public class DynamicLinkTest {

    int num = 10;

    public void methodA(){
        System.out.println("MethodA().....");
    }

    public void methodB(){
        System.out.println("methodB()......");

        methodA();
        num++;
    }
}
