package com.kimking.pattern.create.builder.item;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 20f;
    }
}
