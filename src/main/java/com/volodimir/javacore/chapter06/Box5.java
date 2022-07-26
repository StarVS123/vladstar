package com.volodimir.javacore.chapter06;

public class Box5 {
    double width;
    double hight;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * hight * depth;
    }
    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        hight = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        // инициализировать кажды экземпляр класса box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim( 3, 6, 9);

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // вывести объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
