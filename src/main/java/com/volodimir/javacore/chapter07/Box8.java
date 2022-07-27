package com.volodimir.javacore.chapter07;

public class Box8 {
    double width;
    double height;
    double depth;

    // конструктор, используемый при указании всех размеров
    Box8(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда не один из параметров не указан
    Box8() {
        width = -1; // использовать значение -1 для обозначения неинециализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор, используемый для создания куба
    Box8 (double len) {
        width = height = depth = len;
    }
    // рассчитать и возвратить объем
    double volume () {
        return  width * height * depth;
    }
}
class Overload2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        Box8 mybox1 = new Box8(10,20,15);
        Box8 mybox2 = new Box8();
        Box8 mycube = new Box8(7);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);

    }
}
