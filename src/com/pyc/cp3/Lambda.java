package com.pyc.cp3;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file Lambda
 * @pack com.pyc.CP3
 * @date 2021/1/29
 * @time 20:56
 * @E-mail 2923616405@qq.com
 **/


@FunctionalInterface
interface Func{
    public boolean func(String str);
}

public class Lambda {

    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s->{
            return true;
        };
        lambda.lambda(func);

        lambda.lambda(s->{
            return true;
        });
    }
}
