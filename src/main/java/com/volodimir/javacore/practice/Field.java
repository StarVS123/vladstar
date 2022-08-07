package com.volodimir.javacore.practice;

import java.util.Scanner;

public class Field {

    // переменные, указывающие содержание клеточки
    public static final String EMPTY = "   ";
    public static final String CROSS = " X ";
    public static final String ZERO = " O ";

    // переменная, записывающая активного игрока
    public static String activePlayer;

    // переменные с информацией об игровом поле и состоянии игры
    public static final int LINE = 3;
    public static final int COLUMN = 3;

    // переменная игрового поля
    public static String [][] field = new String[LINE][COLUMN];

    // переменная, указывающая на статус игры
    public static int statusGame;
    public static final int STATUS_CONTINUES = 0, STATUS_DRAW = 1, STATUS_WIN_X = 2, STATUS_WIN_0 = 3;

    // сканер, позволяющий получать введение игрока
    public static Scanner in = new Scanner(System.in);







}
