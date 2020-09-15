package com.kimking.pattern.structure.bridge;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/10
 */
public class Red implements Color {

    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + " draw red " + name);
    }
}
