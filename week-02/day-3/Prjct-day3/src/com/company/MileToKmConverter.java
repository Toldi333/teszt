package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben

        System.out.println("Mérföld:");

        Scanner bemenet = new Scanner(System.in);

        String merfold = bemenet.nextLine();
        double merfoldDouble = Double.valueOf(merfold);

        System.out.println("Kilométer: "+ merfoldDouble / 0.62137);


    }
}
