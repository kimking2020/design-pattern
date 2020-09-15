package com.kimking.pattern.behavior.observer;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HexaObserver update" + subject.getState());
    }
}
