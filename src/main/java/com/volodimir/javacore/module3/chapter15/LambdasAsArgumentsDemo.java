package com.volodimir.javacore.module3.chapter15;

public class LambdasAsArgumentsDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Все будет хорошо.";
        String outStr;

        System.out.println("Это исходная фраза: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);

        System.out.println("Эта строка в верхнем регистре: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        }, inStr);

        System.out.println("Это строка с удаленными пробелами: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}
