package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.
        System.out.println("Adj meg egy számot:");

        Scanner bemenet = new Scanner(System.in);

        String szam = bemenet.nextLine();
        double szamDouble = Double.valueOf(szam);

        if(szamDouble % 2 == 0)
            System.out.println("Páros");
        else
            System.out.println("Páratlan");

    }
}
