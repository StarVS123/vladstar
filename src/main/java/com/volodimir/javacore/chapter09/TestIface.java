package com.volodimir.javacore.chapter09;

public class TestIface implements Callback {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }

    @Override
    public void callback(int param) {

    }
}
