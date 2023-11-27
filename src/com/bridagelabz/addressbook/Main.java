package com.bridagelabz.addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook("Book1");

        Scanner sc = new Scanner(System.in);
        String menu = "Press \n1: Adding a contact\n2: Displaying All Contacts\n3: Search by first name\n4: Search by Phone number\n5: Delete by User First name\n0: To Exit the Program.";

        //Menu based programming
        int input;
        System.out.println("Welcome to AddressBook");
        do {
            System.out.println(menu);
            CrudOperations c1 = new CrudOperations();
            input = sc.nextInt();

            switch (input) {
                //adding the contact in The current address book instance using addContact method
                case 1 -> c1.AddContact(a1);
                //printing the current address book contact list
                case 2 -> System.out.println(a1.contactList);
                //Searching a name in the addressbook
                case 3 -> {
                    System.out.println("Enter the name you want to search");
                    String s1 = sc.next();
                    c1.searchByFirstName(a1,s1);
                }
                case 4 -> {
                    System.out.println("Enter the Phone Number you want to search");
                    String s1 = sc.next();
                    c1.searchByPhoneNumber(a1,s1);
                }
                case 5 -> {
                    System.out.println("Enter the Name you want to delete");
                    String s1 = sc.next();
                    c1.deleteContactByfName(a1,s1);
                }
                case 0 -> System.out.println("Bye bye!!");
                default -> System.out.println("Enter valid option");
            }
        }while (input!=0);
    }
}