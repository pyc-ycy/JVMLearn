package com.pyc.cp2;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file DeadThreadTest
 * @pack com.pyc.CP02
 * @date 2021/1/19
 * @time 21:46
 * @E-mail 2923616405@qq.com
 **/


/*
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread dead = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程2");
        t1.start();
        t2.start();
    }
}
 // 该类只加载一次
class DeadThread{
    static {
        if(true){
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            while (true){

            }
        }
    }
}*/
