package com.kimking.pattern.create.builder.item;

import com.kimking.pattern.create.builder.pack.Bottle;
import com.kimking.pattern.create.builder.pack.Packing;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
