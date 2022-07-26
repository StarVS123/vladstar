package com.volodimir.javacore.chapter06;

public class Box6 {
    double width;
    double hight;
    double depth;

    // это конструктор касса Box
    Box6() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        hight = 10;
        depth = 10;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * hight * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать  объекты Box
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // вывести объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
