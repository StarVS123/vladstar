package com.volodimir.javacore.chapter07;

public class Box9 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор. В качестве параметра в нем используется объект типа Box
    Box9(Box9 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров
    Box9(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    Box9() {
        width = -1; // использовать значение -1 для обозначения неинециализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор, используемый при создании куба
    Box9(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        Box9 mybox1 = new Box9(10, 20, 15);
        Box9 mybox2 = new Box9();
        Box9 mycube = new Box9(7);

        Box9 myclone = new Box9(mybox1);

// создать копию объекта mybox1
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

        // получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);

    }
}
