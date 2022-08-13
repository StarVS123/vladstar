package com.volodimir.javacore.experiments;

public class User {

    String name;

    short age;

    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User(int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public User(String name, int height, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public User(short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public User(int height, short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }


    public static void main(String[] args) {

        User user1 = new User("Ivan", (short) 45, 178);
        User user2 = new User((short) 45, "Ivan", 178);
        User user3 = new User(178, "Ivan", (short) 45);
        User user4 = new User("Ivan", 178, (short) 45);
        User user5 = new User((short) 45, 178, "Ivan");
        User user6 = new User(178, (short) 45, "Ivan");
    }
}
