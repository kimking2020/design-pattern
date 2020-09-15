package com.kimking.pattern.create.builder.item;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 10f;
    }
}
