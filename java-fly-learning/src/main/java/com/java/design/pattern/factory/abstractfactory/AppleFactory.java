package com.java.design.pattern.factory.abstractfactory;

/**
 * Created by guanghua on  2018/10/14
 */

public class AppleFactory extends AbstractFactory {
    @Override
    Juice createJuice() {
        return new AppleJuice();
    }

    @Override
    Pie createPie() {
        return new ApplePie();
    }
}
