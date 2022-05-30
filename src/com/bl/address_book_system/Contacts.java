package com.bl.address_book_system;

public class Contacts {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int zip;
    long phoneNumber;


    public Contacts(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
