package com.volodimir.javacore.module3.chapter15;

public interface NumericFunc {
    int func (int n);
}
class BlockLambdaDemo {
    public static void main(String[] args) {
        // это блочное лямбда-выражение вычисляе факториал целочисленного значения

        NumericFunc factorial = (n) -> {int result = 1;
            for (int i=1; i<=n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа 3 равен: " + factorial.func(3));
        System.out.println("Факториал числа 5 равен: " + factorial.func(5));
    }
}
