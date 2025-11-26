package com.itakademija.PetiCas.Array;

public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = 26;
        System.out.println(number);

        //prvi nacin

        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 26;
        //numbers[2] = 29; ArrayIndexOutOfBounds - Exception Error
        System.out.println("vrijednost na prvoj poziciji je " + numbers[0]);
        System.out.println("vrijednost na drugoj poziciji je " + numbers[1]);

        //drugi nacin

        int[] numbers2 = {23, 26, 39, 45};
        System.out.println("vrijednost na prvoj poziciji je " + numbers2[0]);
        System.out.println("vrijednost na drugoj poziciji je " + numbers2[1]);
        System.out.println("vrijednost na trecoj poziciji je " + numbers2[2]);
        System.out.println("vrijednost na cetvrtoj poziciji je " + numbers2[3]);

    }
}
