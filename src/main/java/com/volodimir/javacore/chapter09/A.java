package com.volodimir.javacore.chapter09;

class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// класс В реализует вложенный интерфейс класса А
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }

}

class NestedIFDemo {
    public static void main(String[] args) {

        // использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10));
        System.out.println("Число 10 не отридцательное.");
        if (nif.isNotNegative(-12));
        System.out.println("Это не будет выведено.");
    }
}