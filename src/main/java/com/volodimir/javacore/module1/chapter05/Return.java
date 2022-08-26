package com.volodimir.javacore.module1.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if (t) return; // возврат в вызывающий код

        System.out.println("Этот оператор выплняться не будет.");
    }
}
