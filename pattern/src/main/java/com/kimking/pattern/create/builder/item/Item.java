package com.kimking.pattern.create.builder.item;

import com.kimking.pattern.create.builder.pack.Packing;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public interface Item {

    String name();
    Packing packing();
    float price();
}
