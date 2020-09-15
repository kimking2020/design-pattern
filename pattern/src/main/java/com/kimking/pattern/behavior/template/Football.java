package com.kimking.pattern.behavior.template;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/15
 */
public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football game initialized");
    }

    @Override
    void start() {
        System.out.println("Football game start");
    }

    @Override
    void end() {
        System.out.println("Football game end");
    }
}
