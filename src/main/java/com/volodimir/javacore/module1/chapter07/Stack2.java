package com.volodimir.javacore.module1.chapter07;

public class Stack2 {
    private int stck2[];
    private int tos;

    // выделить память под стек и инициализировать его
    Stack2(int size) {
        stck2 = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == stck2.length - 1) // использовать член длины массива
            System.out.println("Стек заполнен.");
        else
            stck2[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck2[tos--];
    }
}

class TestStack2 {
    public static void main(String args[]) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
