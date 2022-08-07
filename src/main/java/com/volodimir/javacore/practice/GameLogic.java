package com.volodimir.javacore.practice;

import javax.sound.sampled.Line;

public class GameLogic extends Field {

    // метод, создающий игровое поле и позволяющий начать игру
    public static void Start() {
        for (int line = 0; line < LINE; line++) {
            for (int column = 0; column < COLUMN; column++) {
                field[line][column] = EMPTY;
            }
        }
        activePlayer = CROSS;
        OutputField();
    }

    // метод, позволяющий очередному игроку выбрать, куда он поставит Х или 0 соответственно
    public static void PlayerChoice() {

        boolean correctInput = false;
        do {
            System.out.println("Игрок '" + activePlayer + "' введи строку и столбик от 1 до 3 через пробел.");
            int line = in.nextInt() - 1;
            int column = in.nextInt() - 1;
            if (line >= 0 && line < LINE && column >= 0 && column < COLUMN && field[line][column] == EMPTY) {
                field[line][column] = activePlayer;
                correctInput = true;
            } else {
                System.out.println("Выбранное значение не может быть использовано. Повторите попытку.");
            }
        }
        while (correctInput != true);
    }

    // метод, анализирующий игровое поле, позволяющий определить победил ли, кто то из игроков
    public static void FieldAnalysis() {
        String winner = WhoDidWin();
        if (winner.equals(CROSS)){
            statusGame = STATUS_WIN_X;
        } else if (winner.equals(ZERO)){
            statusGame = STATUS_WIN_0;
        } else if (FieldFilling()){
            statusGame = STATUS_DRAW;
        } else {
            statusGame = STATUS_CONTINUES;
        }
    }

    // метод, проверяющий, заполнены ли все клетки игрового поля (да или нет)
    public static boolean FieldFilling() {
        for (int line = 0; line < LINE; line ++){
            for (int column = 0; column < COLUMN; column ++){
                if (field[line][column] == EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    // метод, проверяющий есть ли победитель, после каждого хода
    public static String WhoDidWin() {

        int iCoincidences;
        // проверка совпадений в строке
        for (int line = 0; line < LINE; line++) {
            iCoincidences = 0;
            for (int column = 0; column < COLUMN; column++) {
                if (field[line][0] != EMPTY && field[line][0] == field[line][column]) {
                    iCoincidences++;
                }
            }
            if (iCoincidences == 3) {
                return field[line][0];
            }
        }
        // проверка совпадений в столбце
        for (int column = 0; column < COLUMN; column++) {
            iCoincidences = 0;
            for (int line = 0; line < LINE; line++) {
                if (field[0][column] != EMPTY && field[0][column] == field[line][column]) {
                    iCoincidences++;
                }
            }
            if (iCoincidences == 3) {
                return field[0][column];
            }
        }
        // проверка совпадений по диагонали слева направо
        if (field[0][0] != EMPTY && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
            return field[0][0];
        }
        // проверка совпадений по диагонали справа налево
        if (field[0][2] != EMPTY && field[1][1] == field[0][2] && field[2][2] == field[0][2]) {
            return field[0][2];
        }
        return EMPTY;
    }

        // метод, который выводит игровое поле в консоль после каждого хода
        public static void OutputField () {
            for (int line = 0; line < LINE; line++) {
                for (int column = 0; column < COLUMN; column++) {
                    System.out.print(field[line][column]);
                    if (column != COLUMN - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (line != LINE - 1) {
                    System.out.println("-----------");
                }
            }
            System.out.println();
        }
    }
