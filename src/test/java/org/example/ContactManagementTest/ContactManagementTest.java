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
        ContactManagement contactList = new ContactManagement();

        //add three contacts
        contactList.addContact("Harry", "9584");
        contactList.addContact("Hedwig", "5684");
        contactList.addContact("Snape", "1674");

        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Snape", "1674");

        //add contacts to local list
        List<Contact> addedContacts = new ArrayList<>();
        addedContacts.add(contact1);
        addedContacts.add(contact2);
        addedContacts.add(contact3);


        List<Contact> foundContacts = contactList.getContactList();

        assertEquals(addedContacts.size(), foundContacts.size());

    }


    @Test
    public void deleteContact_thenVerifyContactIsDeleted() {

        ContactManagement contactList = new ContactManagement();

        //add contacts
        contactList.addContact("Harry", "9584");
        contactList.addContact("Hedwig", "5684");
        contactList.addContact("Snape", "1674");

        contactList.deleteContact("Snape");

        List<Contact> foundContacts = contactList.getContactList();

        assertEquals(2, foundContacts.size());

    }

    @Test
    public void updateName_thenVerifyNameIsUpdated(){

        ContactManagement contactList = new ContactManagement();

        //add contacts

        contactList.addContact("Harry", "9584");
        contactList.addContact("Hedwig", "5684");
        contactList.addContact("Snape", "1674");

        contactList.updateName("Harry", "Ron");
        String newName = "Ron\r\n";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //actual name
        contactList.getName("9584");

        assertEquals(newName, outContent.toString());

    }

    @Test
    public void updateNumber_thenVerifyNumberIsUpdated(){

        ContactManagement contactList = new ContactManagement();

        //add contacts
        contactList.addContact("Harry", "9584");
        contactList.addContact("Hedwig", "5684");
        contactList.addContact("Snape", "1674");

        contactList.updatePhoneNumber("Harry", "1234");
        String newPhoneNumber = "1234\r\n";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //actualPhoneNumber;
        contactList.getPhoneNumber("Harry");

        assertEquals(newPhoneNumber, outContent.toString());
    }


    @Test
    public void searchContact_thenVerifyContactIsShown(){

        ContactManagement contactList = new ContactManagement();

        //add contacts
        contactList.addContact("Harry", "9584");
        contactList.addContact("Hedwig", "5684");
        contactList.addContact("Snape", "1674");


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        contactList.searchContact("H");

        String expectedOutput  = "Name 'Harry', PhoneNumber 9584\r\nName 'Hedwig', PhoneNumber 5684\r\n";

        assertEquals(expectedOutput, outContent.toString());

    }


    @Test
    public void printContactList_VerifyAllContactsArePrinted() {

        ContactManagement contactList = new ContactManagement();

        //add contacts
        contactList.addContact("Harry", "9584");
        contactList.addContact("Hedwig", "5684");
        contactList.addContact("Snape", "1674");


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // After this all System.out.println() statements will come to outContent stream.

        contactList.printContactList();

        //Validate the output with expected String
        String expectedOutput  = "Name 'Harry', PhoneNumber 9584\r\nName 'Hedwig', PhoneNumber 5684\r\nName 'Snape', PhoneNumber 1674\r\n";

        // Do the actual assertion.
        assertEquals(expectedOutput, outContent.toString());
    }




}
