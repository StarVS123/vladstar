package com.volodimir.javacore.module1.chapter03;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; // указать количество дней
        seconds = days * 24 * 60 * 60; //  преобразовать в секунды
        distance = lightspeed * seconds; // вычислить расстояние
        System.out.println("За " + days);
        System.out.println("дней свет пройдет около");
        System.out.println(distance + " миль");

    }
}
