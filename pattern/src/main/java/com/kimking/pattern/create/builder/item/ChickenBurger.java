package com.kimking.pattern.create.builder.item;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 200f;
    }

}
