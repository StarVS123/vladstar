package com.volodimir.javacore.chapter06;

class Box2 {
    double width;
    double haight;
    double depht;
}
public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным mybox1
        mybox1.width = 10;
        mybox1.haight = 20;
        mybox1.depht = 15;

        // *присвоить другие значения переменным mybox2*/
        mybox2.width = 3;
        mybox2.haight = 6;
        mybox2.depht = 9;

        // рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.haight * mybox1.depht;
        System.out.println("Объем равен " + vol);

        // рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.haight * mybox2.depht;
        System.out.println("Объем равен " + vol);
    }
}
