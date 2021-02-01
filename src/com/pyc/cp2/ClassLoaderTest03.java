package com.pyc.cp2;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file ClassLoaderTest03
 * @pack com.pyc.CP02
 * @date 2021/1/21
 * @time 20:56
 * @E-mail 2923616405@qq.com
 **/


public class ClassLoaderTest03 {
    public static void main(String[] args) {
        try {
            // way 1
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);
            // way 2:
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2
            // way 3:
            ClassLoader classLoader1 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader1); // sun.misc.Launcher$ExtClassLoader@4554617c
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
