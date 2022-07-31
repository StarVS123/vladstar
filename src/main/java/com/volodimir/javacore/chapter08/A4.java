package com.volodimir.javacore.chapter08;

public class A4 {
    int i, j;
    A4(int a, int b) {
        i = a;
        j = b;
    }
    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B4 extends A4 {
    int k;
    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // вывести содержимое переменной к с помощью метода, переопределяющего метод show() из класса А3
    void show() {
        super.show(); //здесь вызывается метод show из класса А
        System.out.println("k: " + k);
    }
}
class Override1 {
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);
        subOb.show();
    }
}
