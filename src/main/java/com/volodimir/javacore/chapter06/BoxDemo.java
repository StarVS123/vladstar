package com.volodimir.javacore.chapter06;

import javax.swing.*;

class Box {
    double width;
    double haight;
    double depht;
}
// в этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.haight = 20;
        mybox.depht = 15;

        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.haight * mybox.depht;
        System.out.println("Объем равен " + vol);
    }
}
