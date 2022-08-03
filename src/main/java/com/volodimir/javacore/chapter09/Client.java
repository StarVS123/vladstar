package com.volodimir.javacore.chapter09;

public class Client implements Callback {

    // реализовать интерфейс Callback
    public void callback (int p) {

        System.out.println("Метод Callback вызываемый со значением " + p);
    }
    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, " + "могут определяться и другие члены.");
    }
}
