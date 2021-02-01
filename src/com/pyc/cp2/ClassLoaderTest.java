package com.pyc.cp2;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file ClassLoaderTest
 * @pack com.pyc.CP02
 * @date 2021/1/20
 * @time 20:19
 * @E-mail 2923616405@qq.com
 **/


public class ClassLoaderTest {
    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); // jdk.internal.loader.ClassLoaders$AppClassLoader@2437c6dc
        // 获取其上层：扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader); // jdk.internal.loader.ClassLoaders$PlatformClassLoader@880ec60
        // 再获取上层：获取不到引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        // 输出语句的快捷调用：输出内容.sout 然后回车
        System.out.println(bootstrapClassLoader); // null

        // 对于用户自定义类来说：默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader); // jdk.internal.loader.ClassLoaders$AppClassLoader@2437c6dc

        // 对于常用系统API来说：默认使用引导类加载器进行加载，Java的核心类库都是如此
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader); // null
    }
}
