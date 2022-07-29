package com.example.demo.devise.observer;

import java.util.Vector;

/**
 * @author xiazhinai
 */
public class SubjectImpl implements Subject {
    Vector<Observer> vector = new Vector();

    @Override
    public Boolean addObserver(Observer observer) {
        vector.add(observer);
        return null;
    }

    @Override
    public Boolean removeObserver(Observer observer) {
        vector.remove(observer);
        return null;
    }

    @Override
    public void notifyObserver(String msg) {
        for (Observer observer : vector) {
            observer.update(msg);
        }
    }
}
