package com.pyc.CP3;

import java.util.Date;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file LocalVariablesTest
 * @pack com.pyc.CP3
 * @date 2021/1/24
 * @time 19:13
 * @E-mail 2923616405@qq.com
 **/


public class LocalVariablesTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public void test1(){
        Date date = new Date();
        String name1 = "PYC";
        String info = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date d, String name2){
        d = null;

        name2 = "YCY";
        double weight = 149.5;
        char gender = '男';
        return d + name2;
    }

    public void test3() {count++;}

    public void test4(){
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        // 变量C使用之前已经销毁的变量b所占据的slot 的位置
        int c = a + 1;
    }
    /*
    * 变量分类：按照数据类型分为基本数据类型和引用数据类型
    *         按照在类中声明的位置分为成员变量和局部变量，成员变量包括类变量和实例变量，成员变量在使用前都经历过默认初始化
    *                                           类变量在linking的prepare阶段进行赋值，而在initial阶段进行显示赋值即静态代码块赋值
    *       实例变量会随着对象的创建，在堆空间中分配实例变量空间并进行默认赋值
    *       对于局部变量，在使用之前都必须进行显式赋值，否则编译不通过。
    */
}
