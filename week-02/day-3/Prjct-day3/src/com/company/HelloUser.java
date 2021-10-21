package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
            // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
            // a Világ helyett.
            // A program kérje a felhasználó nevét
        System.out.println("Kérlek, add meg a felhasználó neved!");

        Scanner bemenet = new Scanner(System.in);

        String nev = bemenet.nextLine();

        System.out.println("Hello, " + nev + "!");

    }
}
