package com.volodimir.javacore.module2;

import java.util.Map;
import java.util.Set;
import  java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap< Integer, String> treeMap = new TreeMap<>();

        treeMap.put(2, "Proselyte");
        treeMap.put(1, "AsyaSmile");
        treeMap.put(3, "Peter");
        treeMap.put(5, "Ivan");
        treeMap.put(4, "Konstantin");

        System.out.println("Initial TreeMap content:");

        Set set1 = treeMap.entrySet();
        for (Object element : set1){
            Map.Entry mapEntry1 = (Map.Entry) element;
            System.out.println("ID: " + mapEntry1.getKey() + ", Name: " + mapEntry1.getValue());
        }
        System.out.println("\n====================\n");

        System.out.println("Modifying Proselyte...");
        String name = treeMap.get(2);
        name += "Changed";

        treeMap.put(2, name);

        System.out.println("Final TreeMap content:");

        set1 = treeMap.entrySet();
        for (Object element : set1){
            Map.Entry mapEntry1 = (Map.Entry) element;
            System.out.println("ID: " + mapEntry1.getKey() + ", Name: " + mapEntry1.getValue());
        }
        System.out.println("\n====================\n");
    }
}
