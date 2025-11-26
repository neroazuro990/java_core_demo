package com.itakademija.CetvrtiCas;

import java.util.Scanner;

public class ConditionalTernaryDemo {
    public static void main(String[] args) {
        System.out.println("Koliko je 2+2 ");
        int result = new Scanner(System.in).nextInt();
        boolean uslovTacnosti = result == 4;
        String message = uslovTacnosti ? "tacno" : "netacno";
        if(uslovTacnosti) {
            message = "tacno";
        } else {
            message = "netacno";
        }
        System.out.println(message);


    }
}
