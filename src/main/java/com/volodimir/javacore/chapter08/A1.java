package com.volodimir.javacore.chapter08;

public class A1 {
    int i;         // этот член класса открыт по умолчанию
    private int j; // а этот член закрыт в классе А

    void seti,j (int x, int y) {
        i = x;
        j = y;
    }
}
// Член j класса А в этом классе недоступен
class B1 extends A1 {
    int total;

    void sum() {
        total = i + j; // ОШИБКА член j в этом классе недоступен
    }
}
class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();

        subOb.seti,j (10,12);

        subOb.sum();

        System.out.println("Сумма равна: " + subOb.total);
    }
}
