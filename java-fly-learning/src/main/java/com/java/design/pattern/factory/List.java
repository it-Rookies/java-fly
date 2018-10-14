package com.java.design.pattern.factory;

/**
 * Created by guanghua on  2018/10/14
 */

public interface List<T> {
    Iterator<T> iterator();
    boolean add(T t);
}
