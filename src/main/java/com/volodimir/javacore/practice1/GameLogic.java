package com.volodimir.javacore.practice1;

import java.util.Objects;
import java.util.Scanner;

import static com.volodimir.javacore.practice.Field.*;
import static com.volodimir.javacore.practice.Field.activePlayer;

public class GameLogic {

    private final Field field = new Field();

    private final Scanner scanner = new Scanner(System.in);

    private final String X = "X";
    private final String O = "O";

    public void start() {
    }

    private void makesFirstUserMove() {
        boolean correctInput = false;
        do {
            int choice = scanner.nextInt();
            if (choice >= 0 && choice <= 8) {
                field.setField(choice, X);
                System.out.println("Вы поставили " + X + " в ячейку номер " + choice + ".");
                field.showField();
                correctInput = true;
            } else {
                System.out.println("Неправильный выбор. Повторите ввод.");
            }
        }
        while (correctInput != true);
    }

    private void makeSecondUserMove() {
        boolean correctInput = false;
        do {
            int choice = scanner.nextInt();
            if (choice >= 0 && choice <= 8) {
                field.setField(choice, O);
                System.out.println("Вы поставили " + O + " в ячейку номер " + choice + ".");
                field.showField();
                correctInput = true;
            } else {
                System.out.println("Неправильный выбор. Повторите ввод.");
            }
        }
        while (correctInput != true);
    }

    private String getWinner() {


        if ()
        return null;
    }
}

