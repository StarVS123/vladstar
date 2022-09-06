package com.volodimir.javacore.module2.practice;

import java.util.*;

public class SumSearchMethod2 {
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

        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            int difference = sum - element;
            if (!set1.contains(element)) {
                set1.add(difference);
            } else {
                System.out.println(difference + " " + element);
                break;
            }
        }
    }
}
