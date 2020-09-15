package com.kimking.pattern.behavior.observer;


/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
