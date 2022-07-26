package com.volodimir.javacore.chapter07;

public class OverloadDemo1 {

    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test(double) a: " + a);
    }
}

class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);        // здесь вызывается вариант метода test(double)
        ob.test(123.2); // а здесь вызывается вариант метода test(double)

    }
}
