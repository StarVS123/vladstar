package com.volodimir.javacore.module2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        System.out.println("Adding element into linkedHashSet...");

        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(4);

        System.out.println("linkedHashSet content: ");
        System.out.println(linkedHashSet);

    }
}
