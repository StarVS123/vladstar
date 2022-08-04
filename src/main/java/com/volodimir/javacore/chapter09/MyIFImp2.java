package com.volodimir.javacore.chapter09;

public class MyIFImp2 implements MeIF{
    // в этом классе предоставляется реализация обоих методов интерфейса MyIF
    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "Это другая символьная строка.";
    }
}

