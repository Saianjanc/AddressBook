package com.bridagelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook("Book1");
        AddressBook a2 = new AddressBook("Book2");
        AddressBook a3 = new AddressBook("Book3");
        AddressBook a4 = new AddressBook("Book4");
        AddressBook a5 = new AddressBook("Book5");
        ArrayList<AddressBook> AddressBooks = new ArrayList<>();
        AddressBooks.add(a1);
        AddressBooks.add(a2);
        AddressBooks.add(a3);
        AddressBooks.add(a4);
        AddressBooks.add(a5);
        Scanner sc = new Scanner(System.in);
        String menu = "Press \n1: Adding a contact\n2: Displaying All Contacts\n3: Search by first name\n4: Search by Phone number\n5: Delete by User First name\n6: Update Phone Number\n7: Change AddressBook\n8: Search by City Name\n0: To Exit the Program.";

        //Menu based programming
        int bookno,input;
        System.out.println("Welcome to AddressBook");
        System.out.println("Enter Book Number:");
        bookno=sc.nextInt();
        do {
            System.out.println(menu);
            CrudOperations c1 = new CrudOperations();
            input = sc.nextInt();

            switch (input) {
                //adding the contact in The current address book instance using addContact method
                case 1 -> c1.AddContact(AddressBooks.get(bookno));
                //printing the current address book contact list
                case 2 -> System.out.println(AddressBooks.get(bookno).contactList);
                //Searching a name in the addressbook
                case 3 -> {
                    System.out.println("Enter the name you want to search");
                    String s1 = sc.next();
                    c1.searchByFirstName(AddressBooks.get(bookno),s1);
                }
                case 4 -> {
                    System.out.println("Enter the Phone Number you want to search");
                    String s1 = sc.next();
                    c1.searchByPhoneNumber(AddressBooks.get(bookno),s1);
                }
                case 5 -> {
                    System.out.println("Enter the Name you want to delete");
                    String s1 = sc.next();
                    c1.deleteContactByfName(AddressBooks.get(bookno),s1);
                }
                case 6 -> {
                    System.out.println("Enter the Name you want to update the phone number");
                    String s1 = sc.next();
                    c1.updatePhoneNumberByName(AddressBooks.get(bookno),s1);
                }
                case 7 -> {
                    System.out.println("Enter Book Number:");
                    bookno=sc.nextInt();
                }
                case 8 -> {
                    System.out.println("Enter City to display People from that City");
                    String s1 =sc.next();
                    for (int i=0;i<AddressBooks.size();i++){
                        c1.sreachbycity(AddressBooks.get(i),s1);
                    }
                }
                case 0 -> System.out.println("Bye bye!!");
                default -> System.out.println("Enter valid option");
            }
        }while (input!=0);
    }
}