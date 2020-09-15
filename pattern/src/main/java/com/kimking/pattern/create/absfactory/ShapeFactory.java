package com.kimking.pattern.create.absfactory;

import com.kimking.pattern.create.absfactory.color.Color;
import com.kimking.pattern.create.absfactory.shape.Circle;
import com.kimking.pattern.create.absfactory.shape.Rectangle;
import com.kimking.pattern.create.absfactory.shape.Shape;
import com.kimking.pattern.create.absfactory.shape.Square;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
