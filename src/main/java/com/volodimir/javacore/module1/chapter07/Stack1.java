package com.volodimir.javacore.module1.chapter07;

public class Stack1 {

    /* Теперь переменные stck и tos являются закрытыми.
       Это означает, что они не могут случайно или
       намеренно изменены таким образом, чтобы нарушить стек.
     */
    private int stck1[] = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack1() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck1[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck1[tos--];
    }
}

class TestStack1 {
    public static void main(String args[]) {
        Stack1 mystack1 = new Stack1();
        Stack1 mystack2 = new Stack1();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
        // Эти операторы недопустимы
        // mystask1.tos = -2;
        // mystask2.stck[3] = 100;
    }
}
