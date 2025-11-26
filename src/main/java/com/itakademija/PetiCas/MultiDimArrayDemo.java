package com.itakademija.PetiCas.Array;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Senaid";
        names[1] = "Milica";
        names[2] = "Elmir";
        // Her  Frau  Her
        // Senaid Milic Elmir
        String[] names2 = {"Senaid",  "Milica",  "Elmir"};
        char slovo = 'w';
        String[][] array = {
                {"Her",  "Frau",  "Her"},
                {"Senaid",  "Milica",  "Elmir"}
        };
        System.out.println(array[0][1] + " " +array[1][1]);
        System.out.println(array[0][2] + " " +array[1][2]);
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);

    }
}
