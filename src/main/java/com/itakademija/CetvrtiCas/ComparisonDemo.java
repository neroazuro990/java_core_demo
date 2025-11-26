package com.itakademija.CetvrtiCas;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj:");
        int number2 = new Scanner(System.in).nextInt();
        if (number2 == number1) {
            System.out.println("jednaki");
        }
        if (number2 != number1){
            System.out.println("nejednaki");
        }
        if (number2 <= number1){
            System.out.println("manji ili jednak");
        }

    }
}
