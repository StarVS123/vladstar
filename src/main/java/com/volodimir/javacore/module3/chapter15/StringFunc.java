package com.volodimir.javacore.module3.chapter15;

public interface StringFunc {
    String func (String n);
}
class BlockLambdaDemo2 {
    public static void main(String[] args) {
        // это блочное лямбда-выражение изменяет на обратный порядок следования символов в строке

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1;i >= 0;i --)
            result += str.charAt(i);
            return result;
        };
        System.out.println("ИСКАТЬ ТАКСИ обращается на " + reverse.func("ИСКАТЬ ТАКСИ"));
        System.out.println("РУСНЯ обращается на " + reverse.func("ИДЮЛ ЕН"));
    }
}
