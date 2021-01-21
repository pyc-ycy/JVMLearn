package java.lang;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file String
 * @pack java.lang
 * @date 2021/1/21
 * @time 21:20
 * @E-mail 2923616405@qq.com
 **/


public class String {
    // 若StringTest中的String类加载自该类，那么下面的静态代码块将会被执行
    static {
        System.out.println("我是自定义的String类的静态代码块");
    }
/*
*   错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
    public static void main(String[] args)
    否则 JavaFX 应用程序类必须扩展javafx.application.Application
* */
    public static void main(String[] args) {
        System.out.println("hello string");
    }
}
