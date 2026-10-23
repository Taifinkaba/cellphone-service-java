package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static void main() {
        CellPhone myPhone = new CellPhone();

        Scanner myScanner = new Scanner(System.in);

        // user input
        System.out.println("What is the serial number? ");
        myPhone.setSerialNumber(Integer.parseInt(myScanner.nextLine()));

        System.out.println("What model is the phone? ");
        myPhone.setModel(myScanner.nextLine());

        System.out.println("Who is the carrier? ");
        myPhone.setCarrier(myScanner.nextLine());

        System.out.println("What is the phone number? ");
        myPhone.setPhoneNumber(myScanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        myPhone.setOwner(myScanner.nextLine());




    }
}
