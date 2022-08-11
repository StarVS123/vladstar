package com.volodimir.javacore.practice1;

import java.util.Scanner;

public class GameLogic {

    // дает доступ к объектам класса Field
    private final Field field = new Field();

    // импортирует сканео, позволяющий использовать результат ввода игрока
    private final Scanner scanner = new Scanner(System.in);

    // переменные
    private final String X = "X";

    private final String O = "O";

    // метод, позволяющий начать игру и дающий возможность игрокам вводить свой выбор поочередно
    public void start() {
        boolean isXTurn = true;
        for (int i = 0; i < 9; i++) {

            if (isXTurn == true) {
                makesFirstUserMove();
                isXTurn = false;
            } else {
                makeSecondUserMove();
                isXTurn = true;
            }
            if (getWinner() != null) {
                System.out.println("Победитель " + getWinner());
                break;
            }

        }
    }

    // метод, позволяющий первому игроку сделать корректный ввод
    private void makesFirstUserMove() {
        boolean correctInput = false;
        do {
            System.out.println("Игрок " + X + " введите номер ячейки.");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= 9) {
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

    // метод, позволяющий второму игроку сделать корректный ввод
    private void makeSecondUserMove() {
        boolean correctInput = false;
        do {
            System.out.println("Игрок " + O + " введите номер ячейки.");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= 9) {
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

    // метод, определяющий победителя
    private String getWinner() {

        String[] values = field.getValues();
        if ((values[0] != null && values[1] != null && values[2] != null) && values[0].equals(values[1]) && values[1].equals(values[2])) {
            return values[0];
        } else if ((values[3] != null && values[4] != null && values[5] != null) && values[3].equals(values[4]) && values[4].equals(values[5])) {
            return values[3];
        } else if ((values[6] != null && values[7] != null && values[8] != null) && values[6].equals(values[7]) && values[7].equals(values[8])) {
            return values[6];
        } else if ((values[0] != null && values[3] != null && values[6] != null) && values[0].equals(values[3]) && values[3].equals(values[6])) {
            return values[0];
        } else if ((values[1] != null && values[4] != null && values[7] != null) && values[1].equals(values[4]) && values[4].equals(values[7])) {
            return values[1];
        } else if ((values[2] != null && values[5] != null && values[8] != null) && values[2].equals(values[5]) && values[5].equals(values[8])) {
            return values[2];
        } else if ((values[0] != null && values[4] != null && values[8] != null) && values[0].equals(values[4]) && values[4].equals(values[8])) {
            return values[0];
        } else if ((values[2] != null && values[4] != null && values[6] != null) && values[2].equals(values[4]) && values[4].equals(values[6])) {
            return values[2];
        }
        return null;
    }

    // метод, определяющий, заполнены ли все ячейки игрового поля
    private boolean isFieldFull() {

        boolean result = true;

        for (int index = 0; index < 9; index++) {
            String[] values = field.getValues();
            if (values[index] == null) {
                result = false;
                break;
            }
        }
        return result;
    }

}


