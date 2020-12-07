package org.example.ContactManagement;

import org.example.Contact.Contact;

public class Main {
    public static void main(String[] args) {

        ContactManagement contactBook = new ContactManagement();

        Contact contact1 = new Contact("Fred", "9584");
        Contact contact2 = new Contact("George", "5684");
        Contact contact3 = new Contact("Ginny", "1674");


        contactBook.addContact(contact1);
        contactBook.addContact(contact2);
        contactBook.addContact(contact3);

        System.out.println();

        contactBook.printContactList();

        System.out.println();


        contactBook.searchContact("G");

        System.out.println();

        contactBook.updateName("Fred", "Bill");
        contactBook.updatePhoneNumber("Ginny", "1234");

        contactBook.printContactList();
        System.out.println();
        contactBook.deleteContact("Bill");

        contactBook.printContactList();



    }
}
