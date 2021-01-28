package com.pyc.CP3;

/**
 * @author 御承扬
 * @product IntelliJ IDEA
 * @project projectOne
 * @file AnimalTest
 * @pack com.pyc.CP3
 * @date 2021/1/28
 * @time 21:10
 * @E-mail 2923616405@qq.com
 **/
// 早期绑定和晚期绑定的例子

class Animal{
    public void eat(){
        System.out.println("eating");
    }
}

interface Hunter{
    void hunt();
}

class Dog extends Animal implements Hunter{
    @Override
    public void eat() {
        System.out.println("dog eating");
    }

    @Override
    public void hunt() {
        System.out.println("dog hunted mouse, it should not do so!");
    }
}

class Cat extends Animal implements Hunter{
    @Override
    public void hunt() {
        System.out.println("cat hunted mouse, it is should do so!");
    }

    @Override
    public void eat() {
        System.out.println("cat eating fishes");
    }
}
public class AnimalTest {

    public void showAnimal(Animal animal){
        animal.eat(); // 晚期绑定
    }
    public void showHunt(Hunter hunter){
        hunter.hunt();  // 晚期绑定
    }
}
