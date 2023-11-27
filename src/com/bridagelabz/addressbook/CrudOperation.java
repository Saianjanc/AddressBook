package com.bridagelabz.addressbook;

import java.util.Scanner;

public class CrudOperation {
    Scanner sc = new Scanner(System.in);
    void AddContact(AddressBook a) {

        System.out.println("Enter first name");
        String fname = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter Phone number");
        String phoneNumber = sc.next();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        System.out.println("Enter Relation");
        String relation = sc.next();
        //addressbook.Person.java constructor
        Person p1 = new Person(fname,lname,phoneNumber,zip,relation);
        //added to the address book instance
        a.contactList.add(p1);
    }
}