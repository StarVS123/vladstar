package com.volodimir.javacore.module2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetPerformanceTest{
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Filling our structures...");

        for (int i = 0; i < 1000000; i ++) {
            arrayList.add(i);
            treeSet.add(i);
        }
        System.out.println("Trying to receive element 999,999 in arrayList");

        long start = System.nanoTime();
        arrayList.get(999_999);
        long end = System.nanoTime();

        long timeElapsedArrayList = end - start;

        System.out.println("Time elapsed for TreeSet:" + timeElapsedArrayList);

        System.out.println("Trying to receive element 999,999 in arrayList");

        start = System.nanoTime();
        arrayList.get(999_999);
        end = System.nanoTime();

        long timeElapsedTreeSet = end - start;

        System.out.println("Time elapsed for TreeSet:" + timeElapsedTreeSet);

        System.out.println("TreeSet " + (int)(timeElapsedArrayList/timeElapsedTreeSet) + " times more effective.");
    }
}
