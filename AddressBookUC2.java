package com.Bridgelabz;
import java.util.Scanner;

public class AddressBookUC2 {

    public static void main(String[] args) {


    int choice;
    AddressBookAddContactsUC2 ab = new AddressBookAddContactsUC2();
        do {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Address Book Program");
        System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Show Contact details");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                ab.addContacts();
                break;
            case 2:
                ab.showContacts();
            case 3:
                ab.showContacts();
                break;
        }
    }while (choice != 5);
}
}
