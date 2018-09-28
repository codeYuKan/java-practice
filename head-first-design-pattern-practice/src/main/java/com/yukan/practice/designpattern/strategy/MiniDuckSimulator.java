package com.yukan.practice.designpattern.strategy;

/**
 * @author yukan
 * @date 2018/9/28
 * @email yukan.cn.mail@gmail.com
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();
        mallard.display();
        System.out.println("***********************************change fly behavior***********************************");
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.fly();
    }
}
