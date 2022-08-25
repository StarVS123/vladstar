package com.volodimir.javacore.module2;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();

        System.out.println("Adding elements into IdentityHashMap...");

        identityHashMap.put(3, "Proselyte");
        identityHashMap.put(2, "AsyaSmile");
        identityHashMap.put(5, "Konstantin");
        identityHashMap.put(1, "Ivan");
        identityHashMap.put(4, "Peter");

        System.out.println("LinkedHashMap initial content:");
        Set set = identityHashMap.entrySet();

        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID:" + mapEntry.getKey() + "Name:" + mapEntry.getValue());
        }
        System.out.println("\n======================\n");

        System.out.println("Modifying Proselyte...");

        String name = (String) identityHashMap.get(3);
        name += " Changed";
        identityHashMap.put(3, name);

        System.out.println("LinkedHashMap final content...");
        set = identityHashMap.entrySet();
        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID:" + mapEntry.getKey() + "Name:" + mapEntry.getValue());
        }
        System.out.println("\n======================\n");
    }
}
