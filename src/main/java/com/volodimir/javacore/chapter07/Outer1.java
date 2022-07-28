package com.volodimir.javacore.chapter07;

public class Outer1 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // это внутренний класс
    class Inner {
        int y = 10; // это локальная переменная y класса Inner
        void display() {
            System.out.println("вывод outer_x = " + outer_x);
        }
    }
    void showy() {
        System.out.println(y); // ошибка, здесь переменная y недоступна
    }
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}