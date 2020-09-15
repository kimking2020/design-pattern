package com.kimking.pattern.create.builder.item;

import com.kimking.pattern.create.builder.pack.Packing;
import com.kimking.pattern.create.builder.pack.Wrapper;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
