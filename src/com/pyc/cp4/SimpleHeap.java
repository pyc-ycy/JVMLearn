package com.pyc.cp4;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file SimpleHeap
 * @pack com.pyc.cp4
 * @date 2021/2/1
 * @time 19:12
 * @E-mail 2923616405@qq.com
 **/


public class SimpleHeap {

    private int id;

    public SimpleHeap(int id){
        this.id = id;
    }

    public void show(){
        System.out.println("My ID is: " + id);
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);

        int[] arr = new int[10];

        Object[] arr1 = new Object[10];
    }
}
