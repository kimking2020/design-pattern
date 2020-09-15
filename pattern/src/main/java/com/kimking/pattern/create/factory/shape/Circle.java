package com.kimking.pattern.create.factory.shape;

import lombok.NoArgsConstructor;

/**
 *
 * @author kim
 */
@NoArgsConstructor
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a circle");
    }

}
