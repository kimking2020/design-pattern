package com.kimking.pattern.create.absfactory;

import com.kimking.pattern.create.absfactory.color.Color;
import com.kimking.pattern.create.absfactory.shape.Shape;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);

}
