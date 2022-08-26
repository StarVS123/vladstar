package com.volodimir.javacore.module1.chapter08;

public class Box11 {


    private double width;
    private double height;
    private double depth;

    // Сконструировать клон объекта
    Box11(Box11 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров
    Box11(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый при отсутствии размеров
    Box11() {
        width = -1; // использовать значение -1 служит для обозначения неинециализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box11(double len) {

        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// Теперь в классе BoxWeight полностью реализованы все конструкторы
class BoxWeight1 extends Box11 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight1(BoxWeight1 ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }
    // конструктор, применяемый при указании всех параметров
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d); //вызвать конструктор из суперкласса
        weight = m;
    }
    // конструктор, применяемый по умолчанию
    BoxWeight1() {
        super();
        weight = -1;
    }
    // конструктор, применяемый при создании куба
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 mybox3 = new BoxWeight1(); //по умолчанию
        BoxWeight1 mycube = new BoxWeight1(3,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);
        System.out.println("Вес mybox2 равен: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен: " + vol);
        System.out.println("Вес mybox3 равен: " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен: " + vol);
        System.out.println("Вес myclone равен: " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем myclone равен: " + vol);
        System.out.println("Вес myclone равен: " + mycube.weight);
        System.out.println();
    }
}
