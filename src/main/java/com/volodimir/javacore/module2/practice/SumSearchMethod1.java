package com.volodimir.javacore.module2.practice;

import  java.util.*;

public class SumSearchMethod1 {
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

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            int difference = sum - element;
            if (!hashMap.containsKey(element)) {
                hashMap.put(difference, element);
            }
            else {
                System.out.println(difference + " " + element);
                break;
            }
        }
    }
}
