package com.Bridgelabz;
import java.util.Scanner;


public class AddressBookUC7 {
    static Scanner sc = new Scanner(System.in);

    //Using hashmap creating multiple Address book

    public static void main(String[] args) {
        AddressBookAddContactsUC2 ab = new AddressBookAddContactsUC2();
        ab.addNewAddressBook();
        ab.addContacts();
    }
}