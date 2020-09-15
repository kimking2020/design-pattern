package com.kimking.pattern.structure.decorator;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: circle");
    }
}
