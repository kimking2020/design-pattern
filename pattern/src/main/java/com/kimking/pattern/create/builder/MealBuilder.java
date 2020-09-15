package com.kimking.pattern.create.builder;

import com.kimking.pattern.create.builder.item.*;

/**
 * <p> 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 *
 * 主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 * @author kim
 * @date 2020/9/9
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        Burger burger = new VegBurger();
        ColdDrink coldDrink = new Coke();
        meal.addItem(burger);
        meal.addItem(coldDrink);
        return meal;
    }

    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        Burger burger = new ChickenBurger();
        ColdDrink coldDrink = new Pepsi();
        meal.addItem(burger);
        meal.addItem(coldDrink);
        return meal;
    }
}
