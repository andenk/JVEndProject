package org.example.ContactManagement;

import org.example.Contact.Contact;

public class Main {
    public static void main(String[] args) {


        ContactManagement.addContact("Fred", "9584");
        ContactManagement.addContact("George", "5684");
        ContactManagement.addContact("Ginny", "1674");

        System.out.println();

        ContactManagement.printContactList();

        System.out.println();


        ContactManagement.searchContact("gI");

        System.out.println();

        ContactManagement.updateName("Fred", "Bill");
        ContactManagement.updatePhoneNumber("Ginny", "1234");

        ContactManagement.printContactList();
        System.out.println();
        ContactManagement.deleteContact("Bill");

        ContactManagement.printContactList();



    }
}
