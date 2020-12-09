package org.example.ContactManagement;

import org.example.Contact.Contact;

public class Main {
    public static void main(String[] args) {

        ContactManagement contactList = new ContactManagement();

        contactList.addContact("Fred", "9584");
        contactList.addContact("George", "5684");
        contactList.addContact("Ginny", "1674");

        System.out.println();

        contactList.printContactList();

        System.out.println();


        contactList.searchContact("gI");

        System.out.println();

        contactList.updateName("Fred", "Bill");
        contactList.updatePhoneNumber("Ginny", "1234");

        contactList.printContactList();
        System.out.println();
        contactList.deleteContact("Bill");

        contactList.printContactList();



    }
}
