package com.volodimir.javacore.practice1;

public class Field {
    // объявляем массив из 9 ячеек
    private final String[] values = new String[9];

    //
    public void SetField (int index, String value) {
        this.values[index] = value;
    }
    //
    public void showField(){
        System.out.println(this.values);
    }
}
