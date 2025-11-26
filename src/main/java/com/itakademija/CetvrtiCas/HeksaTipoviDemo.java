package com.itakademija.CetvrtiCas;

public class HeksaTipoviDemo {
    public static void main(String[] args) {
        //tip_podatka varijabla = vrijednost;
        int firstNumber=23; //DECIMALNI zapis vrijednosti
        System.out.println(firstNumber);
        int secondNumber=0x1a; //heksadecimalni zapis vrijednosti
        System.out.println(secondNumber);
        //binarno -> 16=2^4 8=2^3 2=2^1  11010
        int thirdNumber = 0b11010; //Binarni brojni sistem
        System.out.println(thirdNumber);
        long hexNumber = 0xFF_EC;
        System.out.println(hexNumber);
    }
}
