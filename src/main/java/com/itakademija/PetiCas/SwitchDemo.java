package com.itakademija.PetiCas;


import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici za koji zelite saznati ime na Njemackom:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        String dayName;
        switch (weekDayNumber){
            case 1:
                dayName = "Ponedjeljak";
                break;
            case 2:
                dayName = "Utorak";
                break;
            case 3:
                dayName = "Srijeda";
                break;
            case 4:
                dayName = "Cetvrtak";
                break;
            case 5:
                dayName = "Petak";
                break;
            case 6:
                dayName = "Subota";
                break;
            case 7:
                dayName = "Nedjelja";
                break;
            default:
                dayName = "Sedmica ima 7 dana unesi broj od 1 do 7";
                break;
        }
        System.out.println(dayName);

    }
}
