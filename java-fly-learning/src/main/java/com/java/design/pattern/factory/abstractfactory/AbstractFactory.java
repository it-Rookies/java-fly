package com.java.design.pattern.factory.abstractfactory;

/**
 * Created by guanghua on  2018/10/14
 * 抽象工厂描述：https://www.cnblogs.com/my-king/p/5338603.html
 */

public abstract class AbstractFactory {
    abstract Juice createJuice();
    abstract Pie createPie();
}
