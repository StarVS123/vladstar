package com.volodimir.javacore.module1.chapter06;

class Box3 {
    double width;
    double hight;
    double depth;

    // вывести объем паралеллепипеда
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * hight * depth);
    }

}

class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.hight = 20;
        mybox1.depth = 15;

    /* присвоить другие значения переменным экземпляра mebox2
    экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.hight= 6;
        mybox2.depth = 9;

        // вывести объем первого параллелепипеда
        mybox1.volume();

        // вывести объем второго параллелепипеда
        mybox2.volume();
    }
}


