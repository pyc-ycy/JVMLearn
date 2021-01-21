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
}
