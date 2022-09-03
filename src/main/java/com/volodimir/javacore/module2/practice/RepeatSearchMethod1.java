package com.volodimir.javacore.module2.practice;

import java.util.*;

public class RepeatSearchMethod1 {
    private static <T> boolean repeatSearchMethod(T... array) {
        Arrays.sort(array);
        T prev = null;
        for (T element : array) {
            if (element != null && element.equals(prev)) {
                return true;
            }
            prev = element;
        }
        return false;
    }

    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(7);
        arrayList1.add(9);
        arrayList1.add(2);
        arrayList1.add(8);
        arrayList1.add(11);
        arrayList1.add(9);
        arrayList1.add(5);

        if (repeatSearchMethod(arrayList1)) {
            System.out.println("Дубликат найден.");
        }
    }
}
