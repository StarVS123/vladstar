package com.volodimir.javacore.chapter08;

public class A3 {
    int i, j;
    A3(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B3 extends A3 {
    int k;
    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // вывести содержимое переменной к с помощью метода, переопределяющего метод show() из класса А3
    void show() {
        System.out.println("k: " + k);
    }
}
class Override {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2, 3);
        subOb.show(); // здесь вызывается метод show из класса В3
    }
}
