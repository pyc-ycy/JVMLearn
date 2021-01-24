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
        int c = a + 1;
    }
}
