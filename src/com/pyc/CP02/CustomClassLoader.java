package com.pyc.CP02;

import java.io.FileNotFoundException;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file CustomClassLoader
 * @pack com.pyc.CP02
 * @date 2021/1/21
 * @time 20:26
 * @E-mail 2923616405@qq.com
 **/


public class CustomClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if(result == null){
                throw new FileNotFoundException();
            }else {
                return defineClass(name, result,0,result.length);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        throw new ClassNotFoundException();
    }

    private byte[] getClassFromCustomPath(String name){
        // 如果指定路径的字节码文件进行了加密，则需要在此进行解密操作
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> aClass = Class.forName("One", true, customClassLoader);
            Object obj = aClass.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
