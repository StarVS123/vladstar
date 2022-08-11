package com.volodimir.javacore.practice1;

import java.util.Arrays;

public class Field {
    // объявляем массив из 9 ячеек
    private final String[] values = new String[9];

    //метод сеттер, подставляет значение в выбранную ячейку (номер ячейки от 0 до 8, значение "Х" или "0")
    public void setField(int index, String value) {
        index --;
        this.values[index] = value;
    }

    public String[] getValues() {
        return values;
    }

    //метод, выводящий массив в консоль
    public void showField() {
        for (int i = 0; i < 9; i ++) {
            System.out.print(values[i] + " ");
            int y = i + 1;
            if (y % 3 == 0) {
                System.out.println();
            }

        }
    }
}
