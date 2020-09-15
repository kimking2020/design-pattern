package com.kimking.pattern.create.builder.item;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 100f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
