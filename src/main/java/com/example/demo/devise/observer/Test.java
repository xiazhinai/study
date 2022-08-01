package com.example.demo.devise.observer;

/**
 * @author xiazhinai
 * 观察者模式 observer
 */
public class Test {

    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();


        ObserverImpl observer = new ObserverImpl(subject);
        ObserverImpl observer2 = new ObserverImpl(subject);
        ObserverImpl observer3 = new ObserverImpl(subject);

        subject.notifyObserver("123");
        subject.notifyObserver("345");

    }
}
