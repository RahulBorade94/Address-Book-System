package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    //scanner object input purpose

    Scanner sc =new Scanner(System.in);

    //contact class create abject

    Contact contact =new Contact();

    ArrayList <Contact>contactList =new ArrayList<>();


    //adding contact details in AddressBook using addMethod
    public void addContact()
    {
        System.out.println("Address Book Details:");
        System.out.println("Enter First Name");
        contact.setFirstName(sc.next());
        System.out.println("Enter Last Name");
        contact.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contact.setAddress(sc.next());
        System.out.println("Enter the City :");
        contact.setCity(sc.next());
        System.out.println("Enter the State :");
        contact.setState(sc.next());
        System.out.println("Enter the Zip Code :");
        contact.setZip(sc.next());
        System.out.println("Enter the Phone Number :");
        contact.setPhoneNo(sc.next());
        System.out.println("Enter the EMail ID :");
        contact.setEmailID(sc.next());
    }

    //show the contact details in AddressBook using showContact method
    public void showContact() {
        if (contact.getFirstName() == null) {
            System.out.println("Contact Details Not Available");
        } else {
            System.out.println("Contact Details -");
            System.out.println("First Name : " + contact.getFirstName());
            System.out.println("Last Name : " + contact.getLastname());
            System.out.println("Address : " + contact.getAddress());
            System.out.println("City : " + contact.getCity());
            System.out.println("State : " + contact.getState());
            System.out.println("Zip Code : " + contact.getZip());
            System.out.println("Phone Number : " + contact.getPhoneNo());
            System.out.println("EMail ID : " + contact.getEmailID());
        }
    }

        //edit contact in AddressBook editContact method
        public void editContact () {
            System.out.println("Enter a Name");
            String firstName = sc.next();

            if (!firstName.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("The Entered Contact Name is Not Available in Address Book");
            } else {
                System.out.println("Enter the Last Name :");
                contact.setLastname(sc.next());
                System.out.println("Enter the Address :");
                contact.setAddress(sc.next());
                System.out.println("Enter the City :");
                contact.setCity(sc.next());
                System.out.println("Enter the State :");
                contact.setState(sc.next());
                System.out.println("Enter the Zip Code :");
                contact.setZip(sc.next());
                System.out.println("Enter the Phone Number :");
                contact.setPhoneNo(sc.next());
                System.out.println("Enter the EMail ID :");
                contact.setEmailID(sc.next());
            }
        }
        public void deleteContact () {
            System.out.println("Enter a Name");
            String firstName = sc.next();


            boolean isAvailable = false;
            for (Contact contact : contactList) {
                if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                    isAvailable = true;
                    contactList.remove(contact);
                    System.out.println("Contact Deleted");
                    break;
                }

            }
            if (!isAvailable) {
                System.out.println("Contact not found");
            }


        }

    }




