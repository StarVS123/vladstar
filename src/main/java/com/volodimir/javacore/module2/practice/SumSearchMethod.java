package com.volodimir.javacore.module2.practice;

import java.util.*;

public class SumSearchMethod {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(7);
        arrayList.add(19);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(5);
        arrayList.add(3);
        int sum = 30;
        int i, j;

        for (i = 0; i < arrayList.size(); i++) {
            for (j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) + arrayList.get(j) == sum) {
                    System.out.println("Индекс первого элемента: " + i + ".");
                    System.out.println("Индекс второго элемента: " + j + ".");
                    break;
                }
            }
        }
    }
}
