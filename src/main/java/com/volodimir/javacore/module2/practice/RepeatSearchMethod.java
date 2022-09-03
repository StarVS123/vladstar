package com.volodimir.javacore.module2.practice;

import com.volodimir.javacore.module1.chapter03.Array;

import java.util.*;

public class RepeatSearchMethod {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(11);
        arrayList.add(5);
        arrayList.add(9);

        int i, j;
        boolean result = false;

        for (i = 0; i < arrayList.size(); i++) {
            for (j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j).equals(arrayList.get(i))) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}

