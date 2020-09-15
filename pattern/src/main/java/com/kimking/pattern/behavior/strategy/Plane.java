package com.kimking.pattern.behavior.strategy;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public class Plane implements Strategy {

    @Override
    public void travel() {
        System.out.println("travel by Plane");
    }
}
