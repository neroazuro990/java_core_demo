package com.itakademija.CetvrtiCas;

import java.util.Scanner;

public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println("Hej! Upisi omiljeni broj.");
        int omiljeniBroj=new Scanner(System.in).nextInt();
        boolean condition =  omiljeniBroj==15;//true ili false
        if (condition) {
            System.out.println("zadovoljio");
        }else{
            System.out.println("nisi zadovoljio");
        }
    }
}
