package com.company;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party

        System.out.println("Hány lány jön a buliba?");

        Scanner bemenet1 = new Scanner(System.in);

        String nrOfGirls = bemenet1.nextLine();
        double nrOfGirlsDouble = Double.valueOf(nrOfGirls);

        System.out.println("Hány fiú jön a buliba?");

        Scanner bemenet2 = new Scanner(System.in);

        String nrOfBoys = bemenet2.nextLine();
        double nrOfBoysDouble = Double.valueOf(nrOfBoys);

        if(nrOfGirlsDouble + nrOfBoysDouble >= 21 && nrOfGirlsDouble == nrOfBoysDouble && nrOfGirlsDouble > 0)
            System.out.println("Ez a buli kitűnő!");
        else if (nrOfGirlsDouble + nrOfBoysDouble >= 21 && nrOfGirlsDouble != nrOfBoysDouble && nrOfGirlsDouble > 0)
            System.out.println("Ez a buli egész jó!");
        else if (nrOfGirlsDouble + nrOfBoysDouble <= 19 && nrOfGirlsDouble > 0)
            System.out.println("Átlagos buli...");
        else if (nrOfGirlsDouble == 0 && nrOfBoysDouble > 0)
            System.out.println("Virsli party");

    }
}
