package com.kimking.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/14
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
