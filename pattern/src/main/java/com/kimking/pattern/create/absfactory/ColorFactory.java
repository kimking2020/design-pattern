package com.kimking.pattern.create.absfactory;

import com.kimking.pattern.create.absfactory.color.Blue;
import com.kimking.pattern.create.absfactory.color.Color;
import com.kimking.pattern.create.absfactory.color.Green;
import com.kimking.pattern.create.absfactory.color.Red;
import com.kimking.pattern.create.absfactory.shape.Shape;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
