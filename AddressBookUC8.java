package com.Bridgelabz;
import java.util.Scanner;

public class AddressBookUC8 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        AddressBookAddContactsUC2 ab = new AddressBookAddContactsUC2();
        ab.addNewAddressBook();
        ab.addContacts();
        ab.searchByOptions();

    }
}
