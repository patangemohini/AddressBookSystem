package com.bl.address_book_system;

import java.util.Scanner;

public class AddressBookMain {
    static final int ADD_CONTACT = 1;
    static final int DISPLAY_DETAILS = 2;
    static final int EDIT_CONTACT = 3;
    static final int DISPLAY_EDIT_CONTACT = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!!");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int option;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println(" 1.Add a new contact.");
            System.out.println(" 2.display contact.");
            System.out.println(" 3.edit contact.");
            System.out.println(" 4.display edit contact.");
            option = sc.nextInt();

            switch (option) {
                case ADD_CONTACT:
                    addressBook.personInputDetails();
                    break;
                case DISPLAY_DETAILS:
                    addressBook.displayContact();
                    break;
                case EDIT_CONTACT:
                    addressBook.editContact();
                    break;
                case DISPLAY_EDIT_CONTACT:
                    addressBook.displayContact();
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }
        while (option != 5);
    }
}

