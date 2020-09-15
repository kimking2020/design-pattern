package com.kimking.pattern.create.prototype;

import com.kimking.pattern.create.prototype.proto.Circle;
import com.kimking.pattern.create.prototype.proto.Rectangle;
import com.kimking.pattern.create.prototype.proto.Shape;
import com.kimking.pattern.create.prototype.proto.Square;

import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/9
 */
public class ShapeCache {

    private static final ConcurrentHashMap<String, Shape> SHAPE_MAP = new ConcurrentHashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = SHAPE_MAP.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);

    }
}
