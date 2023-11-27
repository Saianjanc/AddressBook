package com.bridagelabz.addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook("Book1");

        Scanner sc = new Scanner(System.in);
        String menu = "Press \n1: Adding a contact\n2: Displaying All Contacts\n0: To Exit the Program.";

        //Menu based programming
        int input;
        System.out.println("Welcome to AddressBook");
        do {
            System.out.println(menu);
            input = sc.nextInt();

            switch (input) {
                //adding the contact in The current address book instance using addContact method
                case 1 -> AddContact(a1);
                //printing the current address book contact list
                case 2 -> System.out.println(a1.contactList);
                case 0 -> System.out.println("Bye bye!!");
                default -> System.out.println("Enter valid option");
            }
        }while (input!=0);
    }
    private static void AddContact(AddressBook a) {
        Scanner sc = new Scanner(System.in);
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
        //person constructor
        Person p1 = new Person(fname,lname,phoneNumber,zip,relation);
        //added to the address book instance
        a.contactList.add(p1);
    }
}