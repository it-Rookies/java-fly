package com.java.design.pattern.factory;

/**
 * Created by guanghua on  2018/10/14
 * 简单工厂模式是不易维护的，如果需要添加新的产品，则整个系统都需要修改。
 * 如果我们需要添加诸如PRO7、PRO8等产品，直接在工程类中添加即可。
 * 但是如果这时候根部不知道还有什么产品，只有到子类实现时才知道
 */

public class SimpleFactory {
    public static void main(String args[]) throws Exception{
        Factory factory = new Factory();
        factory.produce("PRO5").run();
        factory.produce("PRO6").run();
    }
}
//抽象产品
interface MeizuPhone{
    void run();
}
//具体产品X2
class PRO5 implements MeizuPhone{
    @Override
    public void run() {
        System.out.println("我是一台PRO5");
    }
}
class PRO6 implements MeizuPhone{
    @Override
    public void run() {
        System.out.println("我是一台PRO6");
    }
}
//工厂
class Factory{
    MeizuPhone produce(String product) throws Exception{
        if(product.equals("PRO5"))
            return new PRO5();
        else if(product.equals("PRO6"))
            return new PRO6();
        throw new Exception("No Such Class");
    }
}