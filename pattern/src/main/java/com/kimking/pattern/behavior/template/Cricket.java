package com.kimking.pattern.behavior.template;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/15
 */
public class Cricket extends Game {

    @Override
    void end() {
        System.out.println("Cricket game end");
    }

    @Override
    void start() {
        System.out.println("Cricket game start");
    }

    @Override
    void initialize() {
        System.out.println("Cricket game initialized");
    }
}
