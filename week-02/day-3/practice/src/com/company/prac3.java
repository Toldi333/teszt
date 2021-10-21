package com.company;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        System.out.println("Hány lány jön a buliba?");

        Scanner bemenet1 = new Scanner(System.in);

        String nrOfGirls = bemenet1.nextLine();
        double nrOfGirlsDouble = Double.valueOf(nrOfGirls);

        System.out.println("Hány fiú jön a buliba?");


        String nrOfBoys = bemenet1.nextLine();
        double nrOfBoysDouble = Double.valueOf(nrOfGirls);

        if(nrOfGirlsDouble == nrOfBoysDouble && 11 + 12 > 20)
            System.out.println("Ez a buli kitűnő!");
            System.out.println(nrOfBoysDouble);
            System.out.println(nrOfGirlsDouble);


//        else if (nrOfGirlsDouble + nrOfBoysDouble > 20 && nrOfGirlsDouble != nrOfBoysDouble)
//            System.out.println("Ez a buli egész jó!");
    }
}
