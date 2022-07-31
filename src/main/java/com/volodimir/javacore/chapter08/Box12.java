package com.volodimir.javacore.chapter08;

public class Box12 {



    private double width;
    private double height;
    private double depth;

    // Сконструировать клон объекта
    Box12(Box12 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров
    Box12(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый при отсутствии размеров
    Box12() {
        width = -1; // использовать значение -1 служит для обозначения неинециализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box12(double len) {

        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// Добавить поле веса
class BoxWeight2 extends Box12 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight2(BoxWeight2 ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }
    // конструктор, применяемый при указании всех параметров
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); //вызвать конструктор из суперкласса
        weight = m;
    }
    // конструктор, применяемый по умолчанию
    BoxWeight2() {
        super();
        weight = -1;
    }
    // конструктор, применяемый при создании куба
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

// Добавить поле стоимости доставки
class Shipment extends BoxWeight2 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) { // передать объект конструктору
        super(ob);
        cost = ob.cost;
    }
    // конструктор, применяемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); //вызвать конструктор из суперкласса
        cost = c;
    }
    // конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }
    // конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен: " + vol);
        System.out.println("Вес shipment1 равен: " + shipment1.weight);
        System.out.println("Стоимость доставки в $: " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен: " + vol);
        System.out.println("Вес shipment2 равен: " + shipment2.weight);
        System.out.println("Стоимость доставки в $: " + shipment2.cost);
        System.out.println();
    }
}
