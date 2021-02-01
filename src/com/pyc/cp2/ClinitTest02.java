package com.pyc.cp2;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file ClinitTest02
 * @pack com.pyc.CP02
 * @date 2021/1/19
 * @time 21:38
 * @E-mail 2923616405@qq.com
 **/


public class ClinitTest02 {
    static class Father{
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        // 加载 Father 类，再 Son 类，因此结果是 2
        System.out.println(Son.B);
    }
}
