package com.volodimir.javacore.module1.chapter06;

public class Box7 {
    double width;
    double hight;
    double depth;

    // это конструктор касса Box
    Box7(double w, double h, double d) {
        width = w;
        hight = h;
        depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * hight * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать  объекты Box
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // вывести объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
