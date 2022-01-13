package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    //scanner object input purpose

    Scanner sc =new Scanner(System.in);

    //contact class create abject

    Contact contact =new Contact();


    //adding contact details in AddressBook using addMethod
    public void addMethod()
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

    //show the contact details in addressbook using showContact method
    public void showContact(){
        System.out.println("Contact Details -");
        System.out.println("First Name : "+contact.getFirstName());
        System.out.println("Last Name : "+contact.getLastname());
        System.out.println("Address : "+contact.getAddress());
        System.out.println("City : "+contact.getCity());
        System.out.println("State : "+contact.getState());
        System.out.println("Zip Code : "+contact.getZip());
        System.out.println("Phone Number : "+contact.getPhoneNo());
        System.out.println("EMail ID : "+contact.getEmailID());
    }

    //edit conatct in addressbook editContcat method
    public void editContact(){
        System.out.println("Enter a Name");
        String FirstName=sc.next();
        if(!FirstName.equalsIgnoreCase(contact.getFirstName())) {
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

}


