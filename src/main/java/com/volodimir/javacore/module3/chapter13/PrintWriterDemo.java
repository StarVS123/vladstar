package com.volodimir.javacore.module3.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Это строка");
        int i = 10;
        pw.println(i);
        double d = 4.5e-9;
        pw.println(d);
    }
}
