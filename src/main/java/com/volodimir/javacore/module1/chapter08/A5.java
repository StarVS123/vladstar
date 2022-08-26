package com.volodimir.javacore.module1.chapter08;

public class A5 {
    int i, j;
    A5(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B5 extends A5 {
    int k;
    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // перегрузить метод show() из класса А5
    void show(String msg) {
        System.out.println(msg + k);
    }
}
class Override2 {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);
        subOb.show("Это k: "); // вызвать метод show() из класса А5
        subOb.show();               // вызвать метод show() из класса В5
    }

}

