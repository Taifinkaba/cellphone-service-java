package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static void main() {
        // first phone
        CellPhone myPhone = new CellPhone();

        // second phone for dial
        CellPhone secondPhone = new CellPhone();


        Scanner myScanner = new Scanner(System.in);

        // first user input
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

        // second user input
        System.out.println("What is the serial number? ");
        secondPhone.setSerialNumber(Integer.parseInt(myScanner.nextLine()));

        System.out.println("What model is the phone? ");
        secondPhone.setModel(myScanner.nextLine());

        System.out.println("Who is the carrier? ");
        secondPhone.setCarrier(myScanner.nextLine());

        System.out.println("What is the phone number? ");
        secondPhone.setPhoneNumber(myScanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        secondPhone.setOwner(myScanner.nextLine());

        // user output with first phone
        System.out.println("Phone Information:");
        System.out.println("Serial number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

        // user output with second phone
        System.out.println("Phone Information:");
        System.out.println("Serial number: " + secondPhone.getSerialNumber());
        System.out.println("Model: " + secondPhone.getModel());
        System.out.println("Carrier: " + secondPhone.getCarrier());
        System.out.println("Phone number: " + secondPhone.getPhoneNumber());
        System.out.println("Owner: " + secondPhone.getOwner());

        myScanner.close();

    }
}
