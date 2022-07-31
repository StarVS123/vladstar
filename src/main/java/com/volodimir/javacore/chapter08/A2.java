package com.volodimir.javacore.chapter08;

public class A2 {
    A2() {
        System.out.println("В конструкторе А2.");
    }
}
class B2 extends A2 {
    B2() {
        System.out.println("В конструкторе В2.");
    }
}
class C2 extends B2 {
    C2() {
        System.out.println("В конструкторе С2.");
    }
}
class  CallingCons {
    public static void main(String[] args) {
        C2 c2 = new C2();
    }
}
