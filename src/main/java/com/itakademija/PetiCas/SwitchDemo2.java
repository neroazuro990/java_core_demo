package com.itakademija.PetiCas;


import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici za koji zelite saznati ime na Njemackom:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        String dayName = switch (weekDayNumber){
            case 1 -> {
                System.out.println("Ponedjeljak");
                yield "Montag";
            }
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Sedmica ima 7 dana izaberi broj od 1 do 7";
        };
              System.out.println(dayName);

    }
}
