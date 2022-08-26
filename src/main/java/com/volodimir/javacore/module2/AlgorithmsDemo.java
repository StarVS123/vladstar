package com.volodimir.javacore.module2;

import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        arrayList.add(-1);
        arrayList.add(23);
        arrayList.add(53);
        arrayList.add(-42);
        arrayList.add(95);
        arrayList.add(12);
        arrayList.add(36);

        System.out.println("Initial ArrayList...");
        System.out.println(arrayList);

        System.out.println("\n===================\n");

        System.out.println("Sorting ArrayList...");
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList:");
        System.out.println(arrayList);

        System.out.println("\n===================\n");

        System.out.println("Inverting collection...");
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(arrayList, comparator);
        System.out.println("Inverted ArrayList:");
        System.out.println(arrayList);

        System.out.println("\n===================\n");

        System.out.println("Shuffling ArrayList...");
        Collections.shuffle(arrayList);
        System.out.println("Shuffled ArrayList:");
        System.out.println(arrayList);

        System.out.println("\n===================\n");
    }
}
