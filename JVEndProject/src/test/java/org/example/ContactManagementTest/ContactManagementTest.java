package org.example.ContactManagementTest;

import org.example.Contact.Contact;
import org.example.ContactManagement.ContactManagement;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class ContactManagementTest {

    @Test

    public void addContacts_thenVerifyContactsAreAdded() {


        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Harry", "1674");

        //add contacts
        ContactManagement.addContact(contact1);
        ContactManagement.addContact(contact2);
        ContactManagement.addContact(contact3);

        //add contacts to local list
        List<Contact> addedContacts = new ArrayList<>();
        addedContacts.add(contact1);
        addedContacts.add(contact2);
        addedContacts.add(contact3);


        List<Contact> foundContacts = ContactManagement.getContactList();

        assertEquals(addedContacts, foundContacts);


    }


    @Test
    public void deleteContact_thenVerifyContactIsDeleted() {

        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Harry", "1674");
        //add contacts
        ContactManagement.addContact(contact1);
        ContactManagement.addContact(contact3);
        ContactManagement.addContact(contact2);

        ContactManagement.deleteContact(contact1.getName());

        List<Contact> foundContacts = ContactManagement.getContactList();

        assertEquals(2, foundContacts.size());

    }

    @Test
    public void updateName_thenVerifyNameIsUpdated(){


        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Harry", "1674");
        //add contacts
        ContactManagement contactList = new ContactManagement();
        contactList.addContact(contact1);
        contactList.addContact(contact2);
        contactList.addContact(contact3);

        contactList.updateName("Harry", "Ron");
        String newName = "Ron";
        String actualName = contact1.getName();

        assertEquals(newName, actualName);

    }

    @Test
    public void updateNumber_thenVerifyNumberIsUpdated(){
        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Harry", "1674");
        //add contacts
        ContactManagement contactList = new ContactManagement();
        contactList.addContact(contact1);
        contactList.addContact(contact2);
        contactList.addContact(contact3);

        contactList.updatePhoneNumber("Harry", "1234");
        String newPhoneNumber = "1234";
        String actualPhoneNumber = contact1.getPhoneNumber();

        assertEquals(newPhoneNumber, actualPhoneNumber);
    }


    @Test
    public void searchContact_thenVerifyContactIsShown(){
        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Harry", "1674");
        //add contacts
        ContactManagement contactList = new ContactManagement();
        contactList.addContact(contact1);
        contactList.addContact(contact2);
        contactList.addContact(contact3);


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        contactList.searchContact("H");

        String expectedOutput  = "Contact{name='Harry', phoneNumber=9584}\r\nContact{name='Hedwig', phoneNumber=5684}\r\n";

        assertEquals(expectedOutput, outContent.toString());

    }


    @Test
    public void printContactList_VerifyAllContactsArePrinted() {

        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Harry", "1674");
        //add contacts
        ContactManagement contactList = new ContactManagement();
        contactList.addContact(contact1);
        contactList.addContact(contact2);
        contactList.addContact(contact3);


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // After this all System.out.println() statements will come to outContent stream.

        contactList.printContactList();

        //Validate the output with expected String
        String expectedOutput  = "Contact{name='Harry', phoneNumber=9584}\r\nContact{name='Hedwig', phoneNumber=5684}\r\nContact{name='Snape', phoneNumber=1674}\r\n";

        // Do the actual assertion.
        assertEquals(expectedOutput, outContent.toString());
    }




}
