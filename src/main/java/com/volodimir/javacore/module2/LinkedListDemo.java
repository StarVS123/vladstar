package com.volodimir.javacore.module2;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("Adding elements to linkedList...");

        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");

        linkedList.addFirst("First");
        linkedList.addLast("Fifth");

        linkedList.add(1, "One and Half");

        System.out.println("Initial linkedList content:");
        System.out.println(linkedList);

        System.out.println("Removing element First, Fifth and One and half...");

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("One and Half");

        System.out.println("Changing element withe value second");
        linkedList.set(0, "Changed " + linkedList.get(0));

        System.out.println("Final linkedList content:");
        System.out.println(linkedList);

    }

}
