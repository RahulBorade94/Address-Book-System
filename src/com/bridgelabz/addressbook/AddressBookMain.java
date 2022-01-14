package com.bridgelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        //variable declaration
        int choice;

      //AddressBook class method object created

        AddressBook addressBook =new AddressBook();
        do {
            System.out.println("Address Book System");
            System.out.println("1. Add New Contact\n2. Show Contact\n3. Edit Contact" +
                    "\n4. Delete Contact\n5. Exit");
            System.out.println("Select Any Number: ");
            choice = addressBook.sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.showContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    System.out.println("Address Book.");
                    break;
                default:
                    System.out.println(" Select the Number between 1 to 5");
                    break;
            }
        }while( choice != 5 );

    }
    }

