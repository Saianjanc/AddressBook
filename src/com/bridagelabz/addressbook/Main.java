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
            CrudOperation c1 = new CrudOperation();
            input = sc.nextInt();

            switch (input) {
                //adding the contact in The current address book instance using addContact method
                case 1 -> c1.AddContact(a1);
                //printing the current address book contact list
                case 2 -> System.out.println(a1.contactList);
                case 0 -> System.out.println("Bye bye!!");
                default -> System.out.println("Enter valid option");
            }
        }while (input!=0);
    }
}