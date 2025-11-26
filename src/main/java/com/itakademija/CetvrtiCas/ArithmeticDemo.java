package com.itakademija.CetvrtiCas;

import java.util.Scanner;

/**
 * Aritmeticki operatori
 * 1. + Additive operator
 * 2. - Subtraction operator
 * 3. * Multiplication
 * 4. / Division operator
 * 5. % Remainder -> nije dijeljenje nego ostatak od dijeljenja
 */

public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Dobrodosli u nas sistem");
        System.out.println("Unesite prvi broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println("Vas zbir je");
        int suma = number1 + number2;
        System.out.println("Suma = " + suma);
        int razlika = number1 - number2;
        System.out.println("Razlika = " + razlika);
        int multiplication = number1 * number2;
        System.out.println("Rezultat mnozenja = " + multiplication);
        int division = number1 / number2;
        System.out.println("Rezultat dijeljenja = " + division);
        int remainder = number1 % number2;
        System.out.println("Ostatak od dijeljenja = " + remainder);

    }
}
