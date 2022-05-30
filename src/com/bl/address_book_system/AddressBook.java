package com.bl.address_book_system;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public Contacts personInputDetails() {
        Scanner sc = new Scanner(System.in);
        Contacts contact = new Contacts();
        System.out.print("Enter First Name: ");
        contact.setFirstName(sc.nextLine());
        System.out.print("Enter Last Name: ");
        contact.setLastName(sc.nextLine());
        System.out.print("Enter Address: ");
        contact.setAddress(sc.nextLine());
        System.out.print("Enter City: ");
        contact.setCity(sc.nextLine());
        System.out.print("Enter State: ");
        contact.setState(sc.nextLine());
        System.out.print("Enter Email Id: ");
        contact.setEmail(sc.nextLine());
        System.out.print("Enter Phone number: ");
        contact.setPhone(sc.nextLong());
        System.out.print("Enter Zipcode: ");
        contact.setZip(sc.nextInt());
        this.contactsArrayList.add(contact);
        return contact;
    }

    public void displayContact() {
        for (Contacts contact : contactsArrayList) {
            System.out.println("First name : " + contact.firstName);
            System.out.println("last name : " + contact.lastName);
            System.out.println("Address : " + contact.address);
            System.out.println("City : " + contact.city);
            System.out.println("State : " + contact.state);
            System.out.println("Email Id : " + contact.email);
            System.out.println("Phone number : " + contact.phoneNumber);
            System.out.println("Zipcode : " + contact.zip);
        }
    }

    public int findContact(String firstName) {
        for (Contacts cont : contactsArrayList) {
            if (firstName.compareToIgnoreCase(cont.getFirstName()) == 0) {
                return contactsArrayList.indexOf(cont);
            }
        }
        return -1;
    }

    public void editContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstName = scan.next();
        int index = findContact(firstName);
        if (index == 0) {
            contactsArrayList.set(index, personInputDetails());
        } else {
            System.out.println("Contact not found ");
        }
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name to delete : ");
        String firstName = sc.next();
        int index = findContact(firstName);
        if (index == 0) {
            contactsArrayList.remove(index);
            System.out.println("contact deleted");
        } else {
            System.out.println("no such contact to delete!!");
        }
    }
}
