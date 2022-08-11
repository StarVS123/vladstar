package com.volodimir.javacore.practice1;

import java.util.Objects;
import java.util.Scanner;

import static com.volodimir.javacore.practice.Field.*;
import static com.volodimir.javacore.practice.Field.activePlayer;

public class GameLogic {

    private final Field field = new Field();

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
    }

    private void makesFirstUserMove() {
        String value = "X";
        boolean correctInput = false;
        do {
            int choice = scanner.nextInt();
            if (choice >= 0 && choice <= 8) {
            } else {
                System.out.println("Неправильный выбор. Повторите ввод.");
            }
        }
        while (correctInput != true);
    }

    private void makeSecondUserMove() {
        String value = "0";
        boolean correctInput = false;
        do {
        }
        while (correctInput != true);
    }

    private String getWinner() {
        return null;
    }
}

