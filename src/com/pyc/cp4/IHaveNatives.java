package com.pyc.cp4;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file IHaveNatives
 * @pack com.pyc.CP4
 * @date 2021/1/30
 * @time 20:10
 * @E-mail 2923616405@qq.com
 **/


public class IHaveNatives {
    public native void Native1(int x);

    native static public long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;
}
