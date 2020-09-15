package com.kimking.pattern.create.sigleton;

/**
 * <p>单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 *
 * @author kim
 * @date 2020/9/9
 */
public class Person {
    private static Person instance = new Person();

    private Person() {

    }

    public static Person getInstance() {
        return instance;
    }

    public void showMsg() {
        System.out.println("show message");
    }


}
