package com.volodimir.javacore.chapter05;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i ++){
            switch(i){
                case 0:
                    System.out.println("i равна нулю.");
                    break;
                case 1:
                    System.out.println("i равна единице.");
                    break;
                case 2:
                    System.out.println("i равна двум.");
                    break;
                case 3:
                    System.out.println("i равна трем.");
                    break;
                default:
                    System.out.println("i больше трех.");
            }
        }
    }
}
