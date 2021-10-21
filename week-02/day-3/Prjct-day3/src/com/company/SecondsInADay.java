package com.company;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)

        int secondsOfTheDay = 24 * 60 * 60;
//        System.out.println(secondsOfTheDay);
        double secondNow = (currentHours * Math.pow(60, 2) + currentMinutes * 60);
//        System.out.println(secondNow);
        int secondNowInt = (int) secondNow;
        int secondRemaining = (secondsOfTheDay - secondNowInt);
        System.out.println(secondRemaining);
    }
}
