package com.pyc.parental_delegation_mechanism;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file StringTest
 * @pack com.pyc.parental_delegation_mechanism
 * @date 2021/1/21
 * @time 21:17
 * @E-mail 2923616405@qq.com
 **/


public class StringTest {
    public static void main(String[] args) {
        // 仍然加载核心API的String
        String str = new String();
        System.out.println("Hold on!");
        // 上述代码是双亲委派机制的运用
        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());
    }
}
