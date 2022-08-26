package com.volodimir.javacore.module1.chapter08;

public class A6 {
    void callme() {
        System.out.println("В методе callme() из класса А6");
    }
}
class B6 extends A6 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса B6");
    }
}
class C6 extends A6 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса C6");
    }
}
class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6(); // объект класса А6
        B6 b = new B6(); // объект класса B6
        C6 c = new C6(); // объект класса C6

        A6 r; // получить ссылку на объект класса А

        r = a;    // переменная r ссылается наобъект типа А6
        r.callme(); // вызвать вариант метода callme(), определенный в классе А6

        r = b;    // переменная r ссылается наобъект типа B6
        r.callme(); // вызвать вариант метода callme(), определенный в классе B6

        r = c;    // переменная r ссылается наобъект типа C6
        r.callme(); // вызвать вариант метода callme(), определенный в классе C6
    }
}
