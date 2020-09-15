package com.kimking.pattern.structure.decorator;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class BaseShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public BaseShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }


    @Override
    public void draw() {
        decoratedShape.draw();
    }

}
