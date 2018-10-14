package com.java.design.pattern.factory;
//https://blog.csdn.net/wfg18801733667/article/details/60954744，工厂模式解释
//工厂方法模式
public class FactoryMethod {
	public static void main(String args[]){
		IFactory bigfactory;
		bigfactory = new SmallFactory();
		bigfactory.produce().run();
		bigfactory = new BigFactory();
		bigfactory.produce().run();
	}
}
//抽象产品
interface MeizuPhone1{
	void run();
}
//具体产品*2
class PRO51 implements MeizuPhone1{
	@Override
	public void run() {
		System.out.println("我是一台PRO5");
	}
}
class MX51 implements MeizuPhone1{
	@Override
	public void run() {
		System.out.println("我是一台MX5");
	}
}
//抽象工厂
interface IFactory{
	MeizuPhone1 produce();
}
//工厂*2
class BigFactory implements IFactory{
	@Override
	public MeizuPhone1 produce() {
		return new PRO51();
	}
}
class SmallFactory implements IFactory{
	@Override
	public MeizuPhone1 produce() {
		return new MX51();
	}
}