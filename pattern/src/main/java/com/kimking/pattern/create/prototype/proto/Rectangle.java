package com.kimking.pattern.create.prototype.proto;


/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }
}
