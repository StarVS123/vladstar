package com.volodimir.javacore.experiments;

public class Artifact {

    int number;
    String culture;
    String century;

    public  Artifact (int number) {
        this.number = number;
    }

    public  Artifact (int number, String culture) {
        this.number = number;
        this.culture = culture;
    }
    public Artifact (int number, String culture, String century ) {
        this.number = number;
        this.culture = culture;
        this.century = century;
    }
    public  String toString () {
        return "Артефакт " + number + "," + culture + "," + century + ".";
    }

    public static void main(String[] args) {

        Artifact artifact1 = new Artifact(1122);

        Artifact artifact2 = new Artifact(2233, "inki");

        Artifact artifact3 = new Artifact(3344, "acteki", "III до н.э.");


        System.out.println(artifact1);
        System.out.println(artifact2);
        System.out.println(artifact3);

    }
}


