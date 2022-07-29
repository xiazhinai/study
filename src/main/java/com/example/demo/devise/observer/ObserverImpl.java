package com.example.demo.devise.observer;

/**
 * @author xiazhinai
 */
public class ObserverImpl implements Observer {

    ObserverImpl(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(this + ": this handle business :" +msg);
    }
}
