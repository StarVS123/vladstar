package com.volodimir.javacore.chapter06;

public class Test4 {
    int a;          // доступ определяемый по умолчанию
    public int b;   // открытый доступ
    private int c;  // закрытый доступ

    // методы доступа к члену с данного класса
    void setc(int i) {  // установить значение члена с данного класса
        c = i;
    }
    int getc() {  // получить значение члена с данного класса
        return c;
    }
}
class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        // эти операторы правильны, поэтому члены a и b данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // этот оператор не верен и может вызвать ошибку
        // ob.c = 100;   // ОШИБКА!

        // доступ к члену с данного кламма должен осуществляться с помощью методов ее класса
        ob.setc(100);    // ВЕРНО!
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
