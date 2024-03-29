package com.volodimir.javacore.module3.chapter15;

public interface NumericTest {
    boolean test(int n);
}
class LambdaDemo2 {
    public static void main(String[] args) {
        // лямбда-выражение, проверяющее, является ли число четным
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("Число 10 четное.");
        if (!isEven.test(9)) System.out.println("Число 9 не четное.");

        // а теперь воспользуемся лямбда-выражением, в котором проверяется, является ли число неотрицательным
        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1)) System.out.println("Число 1 не отрицательное.");
        if (!isNonNeg.test(-1)) System.out.println("Число -1 отрицательное.");
    }
}
