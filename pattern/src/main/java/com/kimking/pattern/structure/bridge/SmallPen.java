package com.kimking.pattern.structure.bridge;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class SmallPen extends BasePen {

    @Override
    public void draw(String name) {
        String penType = "Small Pen";
        this.color.paint(penType, name);
    }
}
