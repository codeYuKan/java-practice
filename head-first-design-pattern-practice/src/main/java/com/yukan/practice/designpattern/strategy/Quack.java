package com.yukan.practice.designpattern.strategy;

/**
 * @author yukan
 * @date 2018/9/28
 * @email yukan.cn.mail@gmail.com
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
