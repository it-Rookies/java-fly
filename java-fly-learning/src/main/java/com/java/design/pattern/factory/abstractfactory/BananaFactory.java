package com.java.design.pattern.factory.abstractfactory;

/**
 * Created by guanghua on  2018/10/14
 */

public class BananaFactory extends AbstractFactory{
    @Override
    Juice createJuice() {
        return new BananaJuice();
    }

    @Override
    Pie createPie() {
        return new BananaPie();
    }
}
