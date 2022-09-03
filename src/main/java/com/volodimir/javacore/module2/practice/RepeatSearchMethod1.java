package com.volodimir.javacore.module2.practice;

import java.util.*;

public class RepeatSearchMethod1 {
    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(7);
        arrayList1.add(5);
        arrayList1.add(2);
        arrayList1.add(8);
        arrayList1.add(11);
        arrayList1.add(18);
        arrayList1.add(12);

        System.out.println("Размер листа: " + arrayList1.size());

        Set<Integer> set = new HashSet<>(arrayList1);

        System.out.println("Размер сета: " + set.size());

        if (arrayList1.size() > set.size()) {
            System.out.println("Дубликат найден.");
        } else {
            System.out.println("Дубликатов нет.");
        }
    }
}





