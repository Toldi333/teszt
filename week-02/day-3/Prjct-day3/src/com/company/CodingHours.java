package com.company;

public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        //
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        int weekdays = 5;
        int hoursOfCoding = 6;
        int weeksOfSemester = 17;
        double codingHoursOfSemester = weekdays * hoursOfCoding * weeksOfSemester;
        System.out.println("Egy átlagos Green Fox hallgató " + codingHoursOfSemester + " órát tölt kódolással egy félév során.");
        int aveWorkingTime = 52;
        double hoursOfSemester = weeksOfSemester * aveWorkingTime;
        double codingPercentage = codingHoursOfSemester / hoursOfSemester * 100;
        System.out.println("A félév " + codingPercentage + " százalékát tölti a hallgató kódolással.");
    }
}
