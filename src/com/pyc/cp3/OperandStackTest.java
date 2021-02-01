package com.pyc.cp3;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file OperandStackTest
 * @pack com.pyc.CP3
 * @date 2021/1/25
 * @time 21:18
 * @E-mail 2923616405@qq.com
 **/


public class OperandStackTest {
    public void testAddOperation(){
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    public int getSum(){
        int m = 20;
        int n = 10;
        int k = m + n;
        return k;
    }

    public void testGetSum(){
        // 获取上一个栈帧返回的结果，并保存到操作数栈中。
        int i = getSum();
        int j = 10;
    }

    public void add(){
        // question one:
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;
        // question two:
        int i3 = 10;
        int i4 = i3++;
        int i5 = 10;
        int i6 = ++i5;
        // question three
        int i7 = 10;
        i7 = i7++;

        int i8=10;
        i8 = ++i8;

        // four
        int i9 = 10;
        int i10 = i9++ + ++i9;
    }
}
