package com.pyc.cp2;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file HelloApp
 * @pack com.pyc.CP02
 * @date 2021/1/19
 * @time 20:18
 * @E-mail 2923616405@qq.com
 **/


public class HelloApp {
    // 在类加载的prepare阶段被赋值为 1，在 initial 阶段才被赋值为 1
    // 不同数据类型的初始值不一样
    // 如果用 final 修饰，则变量在编译时就会分配了，prepare 阶段会显式初始化
    private static int a = 1;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
