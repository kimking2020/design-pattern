package com.kimking.pattern.structure.bridge;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class BigPen extends BasePen {

    @Override
    public void draw(String name) {
        String penType = "Big pen";
        this.color.paint(penType, name);
    }
}
