package com.volodimir.javacore.module1.chapter09;

public class MyIFImp implements MeIF{
// в этом классе должен быль реализован только метод getNumber(), определенный в интерфейсе MyIF, а вызов метода
// getString разрешается по умолчанию
    @Override
    public int getNumber() {
        return 100;
    }
}
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // метод getNumber() можно вызвать, так как он явно реализован в классе MyIFImp
        System.out.println(obj.getNumber());

        // метод getString() так же можно вызвать, так как в интерфейсе имеется его реализация по умолчанию
        System.out.println(obj.getString());
    }
}
