package com.pyc.CP3;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file StringBuilderTest
 * @pack com.pyc.CP3
 * @date 2021/1/30
 * @time 19:32
 * @E-mail 2923616405@qq.com
 **/

// 何为线程安全：如果只有一个线程才能操作此数据，则必是线程安全
    /*
    * 如果多个线程操作此数据，则此数据是共享数据，若不考虑同步机制的话，则会存在线程安全问题。
    * */
public class StringBuilderTest {
    int num = 10;
    /*s1的声明方式是线程安全的*/
    public static void method1(){
        // StringBuilder: 线程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
    }
    /*stringBuilder 是线程不安全的*/
    public static void method2(StringBuilder stringBuilder){
        stringBuilder.append("a");
        stringBuilder.append("b");
    }
    /*s1的操作：是线程不安全的*/
    public static StringBuilder method3(){
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1;
    }
    /*s1的操作：是线程安全的*/
    public static String method4(){
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1.toString();
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        new Thread(()->{
            s.append("a");
            s.append("b");
        }).start();

        method1();

        method2(s);


    }
}
