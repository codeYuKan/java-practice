package com.yukan.practice.designpattern.strategy;

/**
 * @author yukan
 * @date 2018/9/28
 * @email yukan.cn.mail@gmail.com
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly With Wings");
    }
}
