package com.kimking.pattern.create.prototype.proto;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class Circle extends Shape {

    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("draw a circle");
    }
}
