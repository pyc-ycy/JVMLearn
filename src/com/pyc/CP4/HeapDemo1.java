package com.pyc.CP4;

/**
 * -Xms10m -Xmx10m
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file HeapDemo1
 * @pack com.pyc.CP4
 * @date 2021/1/30
 * @time 22:00
 * @E-mail 2923616405@qq.com
 **/


public class HeapDemo1 {
    public static void main(String[] args) {
        System.out.println("Start...");
        try{
            Thread.sleep(1000000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end....");
    }
}
