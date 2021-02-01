package com.pyc.cp2;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file ClassLoaderTest02
 * @pack com.pyc.CP02
 * @date 2021/1/21
 * @time 19:43
 * @E-mail 2923616405@qq.com
 **/


public class ClassLoaderTest02 {
    public static void main(String[] args) {
        System.out.println("************启动类加载器***************");
        // 获取 BootstrapClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL e : urLs) {
            System.out.println(e.toExternalForm());
        }
        // 从上面的路径中随意选择一个类，查看其类加载器为何,是引导类加载器
        System.out.println("---------------我是分割线-------------");
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader); // null
        System.out.println("***********扩展类加载器**************");
        String extDirs = System.getProperty("java.ext.dirs");
        for(String path : extDirs.split(";")){
            System.out.println(path);
        }
        // 从上面的路径中随意选择一个类，查看其类加载器为何, 是扩展类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1); // sun.misc.Launcher$ExtClassLoader@7ea987ac
    }
}
