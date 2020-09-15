package com.kimking.pattern.behavior.observer;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public class ObserverPattern {

    public static void main(String... args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        subject.setState("start");
        subject.setState("stop");
    }
}
