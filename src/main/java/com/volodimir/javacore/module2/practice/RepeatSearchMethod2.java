package com.volodimir.javacore.module2.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RepeatSearchMethod2 {
    public static void main(String[] args) {

        List<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(7);
        arrayList2.add(9);
        arrayList2.add(2);
        arrayList2.add(8);
        arrayList2.add(11);
        arrayList2.add(5);
        arrayList2.add(19);

        Collections.sort(arrayList2);

        boolean result = false;

        for (int i = 0; i < arrayList2.size() - 1; i++) {
            if (arrayList2.get(i).equals(arrayList2.get(i + 1))) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
