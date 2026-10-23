package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static void main() {
        // first phone and second phone
        CellPhone myPhone = new CellPhone();
        CellPhone secondPhone = new CellPhone();

        Scanner myScanner = new Scanner(System.in);

        // prompt user to gatherPhoneInfo method
        System.out.println("First phone: ");
        gatherPhoneInfo(myScanner, myPhone);

        System.out.println("Second phone: ");
        gatherPhoneInfo(myScanner, secondPhone);


        // user input goes into display method
        display(myPhone);
        display(secondPhone);

        // utilize dial method for users
        myPhone.dial(secondPhone.getPhoneNumber());
        secondPhone.dial(myPhone.getPhoneNumber());

        myScanner.close();

    }

    // gather user input
    static void gatherPhoneInfo(Scanner myScanner, CellPhone phone) {
        // user input
        System.out.println("What is the serial number? ");
        phone.setSerialNumber(Integer.parseInt(myScanner.nextLine()));

        System.out.println("What model is the phone? ");
        phone.setModel(myScanner.nextLine());

        System.out.println("Who is the carrier? ");
        phone.setCarrier(myScanner.nextLine());

        System.out.println("What is the phone number? ");
        phone.setPhoneNumber(myScanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        phone.setOwner(myScanner.nextLine());
    }
    // display method for the output
    static void display(CellPhone phone) {
        // display output for user input
        System.out.println("Phone Information:");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
