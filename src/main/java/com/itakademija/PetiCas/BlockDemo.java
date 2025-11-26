package com.itakademija.PetiCas;

import java.util.Scanner;

public class BlockDemo {
    public static void main(String[] args) {
        //jednostavnija kontrola toka
        System.out.println("Unesi neki broj i provjeri da li si srecan ?!");
        int number = new Scanner(System.in).nextInt();
        boolean uslovSrece = number >= 10;
        if(uslovSrece){
            System.out.println("srecan si");
        }else{
            System.out.println("niste srecni");
        }

    }
}
