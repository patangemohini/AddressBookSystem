package com.bl.address_book_system;
import java.util.Scanner;

public class AddressBook {

    public void personInputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name : ");
        String lastName = sc.nextLine();
        System.out.println("Enter Address : ");
        String address = sc.nextLine();
        System.out.println("Enter City : ");
        String city = sc.nextLine();
        System.out.println("Enter State : ");
        String state = sc.nextLine();
        System.out.println("Enter Email : ");
        String email = sc.nextLine();
        System.out.println("Enter zip : ");
        int zip = sc.nextInt();
        System.out.println("Enter PhoneNumber : ");
        long phoneNumber = sc.nextLong();

        Contacts con = new Contacts(firstName, lastName, address, city, state, email, zip, phoneNumber);
    }
}

