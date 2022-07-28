package com.volodimir.javacore.chapter07;

public class Outer2 {
    int outer_x = 100;

    void test () {
        for (int i = 0; i < 10; i ++) {
            class Inner1 {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner1 inner = new Inner1();
            inner.display();
        }
    }
}
class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
