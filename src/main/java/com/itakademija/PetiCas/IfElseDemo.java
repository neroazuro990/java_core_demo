package com.itakademija.PetiCas;

import java.util.Scanner;

/**
 * Postavka zadatka
 * Potrebno je napraviti program koji ce olaksati ocjenjivanje
 * Profesor ce se fokusirati na evaluaciju rada i zbir poena koji su ostvareni
 * a mi cemo u odnosu na to napraviti
 * program za odredjenu ocjenu u odnosu na broj ostvarenih poena.
 * A 10
 * B 9
 * C 8
 * D 7
 * E 6
 * F 5
 */

public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj ostvarenih poena na ispitu: ");
        int score = new Scanner(System.in).nextInt();
        char grade;
        if (score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >= 70){
            grade = 'C';
        }else if (score >= 60){
            grade = 'D';
        }else if (score >= 50){
            grade = 'E';
        }else {
            grade = 'F';
        }
        System.out.println(grade);

    }
}
