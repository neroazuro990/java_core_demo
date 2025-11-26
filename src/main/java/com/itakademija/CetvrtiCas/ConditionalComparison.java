package com.itakademija.CetvrtiCas;

import java.util.Scanner;

public class ConditionalComparison {
    public static void main(String[] args) {
        System.out.println("Unesite broj 1");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj 2");
        int broj2 = new Scanner(System.in).nextInt();
        if ((broj1==23) && (broj2<10)){
            System.out.println("Majkl i neki fudbaler");
        }
        if ((broj1==23) || (broj2<10)){
            System.out.println("ili majkl ili neki fubaler");
        }




        }
}
