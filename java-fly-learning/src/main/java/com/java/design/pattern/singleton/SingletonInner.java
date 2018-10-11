package com.java.design.pattern.singleton;

/**
 * Created by guanghua on  2018/10/11
 * . 内部类[推荐用]
 *  * <p>
 *  * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 *  * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 *  * 不同的地方:
 *  * 在饿汉式方式是只要Singleton类被装载就会实例化,
 *  * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 *  * <p>
 *  * 优点：避免了线程不安全，延迟加载，效率高
 */

public class SingletonInner {
    private SingletonInner(){}
    private static class SingletonHolder{
        private static SingletonInner singletonInner=new SingletonInner();
    }

    public static SingletonInner getSingletonInner() {
        return SingletonHolder.singletonInner;
    }
}
