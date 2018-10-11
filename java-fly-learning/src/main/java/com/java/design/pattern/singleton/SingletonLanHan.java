package com.java.design.pattern.singleton;

/**
 * Created by guanghua on  2018/10/11
 * 含懒汉式[双重校验锁 推荐用]
 */

public class SingletonLanHan {
    private SingletonLanHan(){}
    private static SingletonLanHan singletonLanHan;
    /**
     * 1.单例模式的懒汉式[线程不安全，不可用]
     */

    public static  SingletonLanHan getInstance(){
        if (singletonLanHan==null){
            singletonLanHan=new SingletonLanHan();
        }
        return singletonLanHan;
    }

    /**
     * 2. 懒汉式线程安全的:[线程安全，效率低不推荐使用]
     * <p>
     * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
     * 而其实这个方法只执行一次实例化代码就够了，
     * 后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
     */

    public static synchronized SingletonLanHan getInstanceTwo(){
        if (singletonLanHan==null){
            singletonLanHan=new SingletonLanHan();
        }
        return singletonLanHan;
    }

    /**
     * 3. 单例模式懒汉式[线程不安全，不可用]
     * <p>
     * 虽然加了锁，但是等到第一个线程执行完instance=new Singleton()跳出这个锁时，
     * 另一个进入if语句的线程同样会实例化另外一个Singleton对象，线程不安全的原理跟3类似。
     */

    public static synchronized SingletonLanHan getInstanceThree(){
        if (singletonLanHan==null){
            synchronized (SingletonLanHan.class){
                singletonLanHan=new SingletonLanHan();
            }
        }
        return singletonLanHan;
    }
    /**
     * 4.单例模式懒汉式双重校验锁[推荐用]
     * 懒汉式变种,属于懒汉式的最好写法,保证了:延迟加载和线程安全
     */
    public static synchronized SingletonLanHan getInstanceFour(){
        if (singletonLanHan==null){
            synchronized (SingletonLanHan.class){
                if (singletonLanHan==null){
                    singletonLanHan=new SingletonLanHan();
                }
            }
        }
        return singletonLanHan;
    }
}
