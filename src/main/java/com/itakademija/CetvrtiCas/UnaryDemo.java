package com.itakademija.CetvrtiCas;

public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number++);//1. posalji u konzolu 23. -> 2. nakon slanja u konzolu uvecaj za 1 = 24
        System.out.println(++number);//1. uvecaj za 1. = 25. posalji u konzolu 25

        int broj1 =  24;
        System.out.println(broj1--);//1. posalji u konzolu 24. -> 2. nakon slanja u konzolu umanji za 1 = 23
        System.out.println(--broj1);//1. umanji za 1 broj 23. nakon toga posalji u konzolu 22.

        boolean succes = true;
        System.out.println(!succes);
    }
}
