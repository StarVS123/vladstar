package com.volodimir.javacore.chapter09;

import com.volodimir.javacore.chapter09.MyPack.Balance;

public class TestBalance {
    public static void main(String[] args) {
        /* класс Balance объявлен как public, поэтому им можно воспользоваться и вызвать его конструктор */
        Balance test = new Balance("J. J. Jaspers", 99.88);

        test.show();
    }
}
