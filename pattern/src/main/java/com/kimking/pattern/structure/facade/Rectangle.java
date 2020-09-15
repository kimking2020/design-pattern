package com.kimking.pattern.structure.facade;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
