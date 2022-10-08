package com.volodimir.javacore.module3.chapter15;

public interface SomeFunc<T>{
    T func (T t);
}
class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // использовать строковый вариант интерфейса SomeFunc

        SomeFunc<String> reverse = (str) -> {
            String result = " ";
            int i;

            for (i = str.length()-1; i >= 0; i --)
                result += str.charAt(i);
            return result;
        };
        System.out.println("ИСКАТЬ ТАКСИ обращается на " + reverse.func("ИСКАТЬ ТАКСИ"));
        System.out.println("РУСНЯ обращается на " + reverse.func("ИДЮЛ ЕН"));

        // а теперь использовать целочисленный вариант интерфейса SomeFunc

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <=n; i ++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа 3 равен: " + factorial.func(3));
        System.out.println("Факториал числа 5 равен: " + factorial.func(5));
    }
}