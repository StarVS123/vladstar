package com.volodimir.javacore.module2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        System.out.println("Adding elements into linkedHashMap...");

        linkedHashMap.put(3, "Proselyte");
        linkedHashMap.put(2, "AsyaSmile");
        linkedHashMap.put(5, "Konstantin");
        linkedHashMap.put(1, "Ivan");
        linkedHashMap.put(4, "Peter");

        System.out.println("LinkedHashMap initial content:");

        Set set = linkedHashMap.entrySet();
        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID:" + mapEntry.getKey() + "Name:" + mapEntry.getValue());
        }
        System.out.println("\n======================\n");

        System.out.println("Modifying Proselyte...");

        String name = (String) linkedHashMap.get(3);
        name += " Changed";
        linkedHashMap.put(3, name);

        System.out.println("LinkedHashMap final content...");
        set = linkedHashMap.entrySet();
        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID:" + mapEntry.getKey() + "Name:" + mapEntry.getValue());
        }
        System.out.println("\n======================\n");
    }
}
