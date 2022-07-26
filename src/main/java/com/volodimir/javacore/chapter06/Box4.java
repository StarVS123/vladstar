package com.volodimir.javacore.chapter06;

public class Box4 {
    double width;
    double hight;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * hight * depth;
    }

}

class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.hight = 20;
        mybox1.depth = 15;

    /* присвоить другие значения переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.hight= 6;
        mybox2.depth = 9;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен" + vol);

        // вывести объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен" + vol);
    }

}
