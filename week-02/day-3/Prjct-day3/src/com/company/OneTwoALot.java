package com.company;

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"

        System.out.println("Adj meg egy számot:");

        Scanner bemenet = new Scanner(System.in);

        String szam = bemenet.nextLine();
        double szamDouble = Double.valueOf(szam);

        if(szamDouble <= 0)
            System.out.println("Nem elég");
        else if(szamDouble == 1)
            System.out.println("Egy");
        else if(szamDouble == 2)
            System.out.println("Kettő");
        else if(szamDouble > 2)
            System.out.println("Sok");
    }
}
