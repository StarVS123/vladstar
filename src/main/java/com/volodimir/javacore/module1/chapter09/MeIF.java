package com.volodimir.javacore.module1.chapter09;

public interface MeIF {
    // объявление обычного метода в интерфейсе
    int getNumber();

    // объявление метода по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию.";
    }
}
