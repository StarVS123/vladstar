package com.volodimir.javacore.module1.chapter07;

public class Factorial {
    // это рекурсивный метод
    int fact (int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n -1) * n;
        return result;
    }
}
class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial 3 равен: " + f.fact(3));
        System.out.println("Factorial 4 равен: " + f.fact(4));
        System.out.println("Factorial 5 равен: " + f.fact(5));
    }
}
