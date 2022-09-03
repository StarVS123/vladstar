package com.volodimir.javacore.module2.practice;

import com.volodimir.javacore.module1.chapter08.A;

import java.util.*;

public class RepeatSearchMethod1 {
    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(7);
        arrayList1.add(9);
        arrayList1.add(2);
        arrayList1.add(8);
        arrayList1.add(11);
        arrayList1.add(9);
        arrayList1.add(5);

        Collections.sort(arrayList1);

        for (int i = 0; i < arrayList1.length - 1; i++) {
            if (i == (i + 1)) {
                return;
            }
        }
    }
}

