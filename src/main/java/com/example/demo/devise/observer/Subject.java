package com.example.demo.devise.observer;


/**
 * @author xiazhinai
 */
public interface Subject {
    Boolean addObserver(Observer observer);

    Boolean removeObserver(Observer observer);

    void notifyObserver(String msg);
}
