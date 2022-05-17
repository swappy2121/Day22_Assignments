package com.Bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookAddContactsUC2 {
    ArrayList<ContactsUC2> list = new ArrayList<ContactsUC2>();

    public void addContacts() {

        ContactsUC2 contacts = new ContactsUC2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Contact details");

        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());

        System.out.println("Enter the Last Name :");
        contacts.setLastName(sc.next());

        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());

        System.out.println("Enter the City :");
        contacts.setCity(sc.next());

        System.out.println("Enter the State :");
        contacts.setState(sc.next());

        System.out.println("Enter the Zip Code :");
        contacts.setZip(sc.next());

        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(sc.next());

        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());

        list.add(contacts);
    }

    //Method to Show the Contact Details
    public void showContacts() {
        for (ContactsUC2 contacts : list) {
            System.out.println("Contact Details -");
            System.out.println("First Name : " + contacts.getFirstName());
            System.out.println("Last Name : " + contacts.getLastName());
            System.out.println("Address : " + contacts.getAddress());
            System.out.println("City : " + contacts.getCity());
            System.out.println("State : " + contacts.getState());
            System.out.println("Zip Code : " + contacts.getZip());
            System.out.println("Phone Number : " + contacts.getPhoneNumber());
            System.out.println("EMail ID : " + contacts.getEmail());
        }

    }

}
