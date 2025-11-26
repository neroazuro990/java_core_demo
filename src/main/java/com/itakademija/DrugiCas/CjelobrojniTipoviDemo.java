package com.itakademija.DrugiCas;

public class CjelobrojniTipoviDemo {
    public static void main(String[] args) {
        byte firstNumber = 122;
        System.out.println("Deklarisao si varijablu=" + firstNumber);
        short secondNumber = 22_585;
        System.out.println("short=" + secondNumber);
        int thirdNumber = 147;
        System.out.println("int="+thirdNumber);
        long longNumber = thirdNumber;
        System.out.println("p="+thirdNumber);
        int intNumber = (int)longNumber;
        System.out.println(longNumber);
    }
}
