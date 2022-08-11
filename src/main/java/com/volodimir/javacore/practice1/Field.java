package com.volodimir.javacore.practice1;

public class Field {
    // объявляем массив из 9 ячеек
    private final String[] values = new String[9];

    //метод сеттер, подставляет значение в выбранную ячейку (номер ячейки от 0 до 8, значение "Х" или "0")
    public void setField(int index, String value) {
        this.values[index] = value;
    }

}

    //метод, выводящий массив в консоль
    public void showField() {
        System.out.println(this.values);
    }
}
