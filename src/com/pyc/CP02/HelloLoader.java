package com.pyc.CP02;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file HelloLoader
 * @pack com.pyc.CP02
 * @date 2021/1/19
 * @time 19:01
 * @E-mail 2923616405@qq.com
 **/
/*
* 类加载分为验证Verify、准备Prepare 和解析Resolve
* 验证主要包括文件格式验证、元数据验证、字节码验证、符号引用验证，确保class文件的字节流中包含的信息符合当前虚拟机的要求，保证加载类的正确性，
* 保证不会危害虚拟机自身
* 准备阶段进行内存分配和类成员变量的初始值默认设置（不包括final修饰的）
* 解析降常量池中的符号引用转为直接引用的过程
* */

public class HelloLoader {
    public static void main(String[] args) {
        System.out.println("谢谢ClassLoader加载我********");
        System.out.println("你的大恩大德我下辈子再报！");
        System.out.println(HelloLoader.class);
    }
}
