package com.volodimir.javacore.module2;

import java.util.Comparator;

public class Developer implements Comparator, Comparable {
    private String name;
    private int salary;

    public Developer() {
    }
    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int compareTo(Developer developer) {
        return this.name.compareTo(developer.name);
    }

    public int compare(Developer developer1, Developer developer2) {
        return developer1.salary - developer2.salary;
    }

    public String toString() {
        return "Developer Info:" +
                "\nName: " + name +
                "\nSalary: $" + salary + "\n";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
