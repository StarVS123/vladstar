package com.volodimir.javacore.module1.chapter08;

abstract class A7 {
    abstract void callme();

    //абстрактные классы все же могут содержать конкретные методы

    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}
class B7 extends A7 {
    void callme() {
        System.out.println("Реализация метода callme() из класса В7.");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        B7 b = new B7();

        b.callme();
        b.callmetoo();
    }
}
