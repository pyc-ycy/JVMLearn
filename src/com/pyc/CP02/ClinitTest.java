package com.pyc.CP02;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file ClinitTest
 * @pack com.pyc.CP02
 * @date 2021/1/19
 * @time 20:53
 * @E-mail 2923616405@qq.com
 **/

// 此类的类字节码文件中，将不存在clinit方法，因为没有静态代码块
    //当添加了static变量重新编译后，便会生成clinit方法
public class ClinitTest {
    private int num01 = 1;
    private static int num03 = 9; // 1
    public ClinitTest(){
        this.num01 = 10;
        int num04 = 25;
    }

    public static void main(String[] args) {
        int num02 = 3;
    }
}
// 任何一个类声明之后，内部至少存在一个类的构造器，在字节码中就是 init方法