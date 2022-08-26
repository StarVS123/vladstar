package com.volodimir.javacore.module1.chapter08;

public class Box10 {

    double width;
    double height;
    double depth;

    // Сконструировать клон объекта
    Box10(Box10 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров
    Box10(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый при отсутствии размероа
    Box10() {
        width = -1; // использовать значение -1 служит для обозначения неинециализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box10(double len) {

        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
// Расширить класс Box, включив в него поле веса
class BoxWeight extends Box10 {
    double weight; // вес параллелепипеда

    // Конструктор BoxWeight()
    BoxWeight (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;

    }
}
class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);
        System.out.println("Вес mybox2 равен: " + mybox2.weight);
    }
}
