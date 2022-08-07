package com.volodimir.javacore.practice;

import static com.volodimir.javacore.practice.Field.*;
import static com.volodimir.javacore.practice.GameLogic.*;

public class GameRunner {
    public static void main(String[] args) {
        Start();
        do {
            PlayerChoice();
            FieldAnalysis();
            OutputField();
            if (statusGame == STATUS_WIN_X){
                System.out.println("Победа игрока Х.");
            } else if (statusGame == STATUS_WIN_0) {
                System.out.println("Победа игрока O.");
            } else if (statusGame == STATUS_DRAW) {
                System.out.println("Ничья.");
            }

            // тернарный оператор (сокращенный вид оператора if else)
            activePlayer = (activePlayer == CROSS?ZERO:CROSS);
        }
        while (statusGame == STATUS_CONTINUES);
    }

}
