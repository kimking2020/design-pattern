package com.kimking.pattern.create.prototype.proto;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class Square extends Shape {

    public Square() {
        type = "square";
    }

    @Override
    public void draw() {
        System.out.println("draw a square");
    }
}
