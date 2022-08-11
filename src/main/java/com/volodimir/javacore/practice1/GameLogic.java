package com.volodimir.javacore.practice1;

import java.util.Scanner;

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

       String[] values = field.getValues();
       if (values[0].equals(values[1]) && values[1].equals(values[2])) {
           return values[0];
       }
       else if (values[3].equals(values[4]) && values[4].equals(values[5])) {
           return values[3];
       }
       else if (values[6].equals(values[7]) && values[7].equals(values[8])) {
           return values[6];
       }
       else if (values[0].equals(values[3]) && values[3].equals(values[6])) {
           return values[0];
       }
       else if (values[1].equals(values[4]) && values[4].equals(values[7])) {
           return values[1];
       }
       else if (values[2].equals(values[5]) && values[5].equals(values[8])) {
           return values[2];
       }
       else if (values[0].equals(values[4]) && values[4].equals(values[8])) {
           return values[0];
       }
       else if (values[2].equals(values[4]) && values[4].equals(values[6])) {
           return values[2];
       }
        return null;
    }

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


