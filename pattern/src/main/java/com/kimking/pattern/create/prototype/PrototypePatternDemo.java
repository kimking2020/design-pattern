package com.kimking.pattern.create.prototype;

import com.kimking.pattern.create.prototype.proto.Shape;

/**
 * <p>
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。
 *
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 *
 *
 *
 * @author kim
 * @date 2020/9/9
 */
public class PrototypePatternDemo {

    public static void main(String... args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        circle.draw();
        Shape square = ShapeCache.getShape("2");
        square.draw();
        Shape rectangle = ShapeCache.getShape("3");
        rectangle.draw();
    }

}
