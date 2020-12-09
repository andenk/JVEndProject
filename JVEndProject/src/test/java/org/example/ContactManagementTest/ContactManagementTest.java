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

        //add three contacts
        ContactManagement.addContact("Harry", "9584");
        ContactManagement.addContact("Hedwig", "5684");
        ContactManagement.addContact("Snape", "1674");

        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");
        Contact contact2 = new Contact("Hedwig", "5684");
        Contact contact3 = new Contact("Snape", "1674");

        //add contacts to local list
        List<Contact> addedContacts = new ArrayList<>();
        addedContacts.add(contact1);
        addedContacts.add(contact2);
        addedContacts.add(contact3);


        List<Contact> foundContacts = ContactManagement.getContactList();

        assertEquals(addedContacts.size(), foundContacts.size());



    }


    @Test
    public void deleteContact_thenVerifyContactIsDeleted() {

        //add contacts
        ContactManagement.addContact("Harry", "9584");
        ContactManagement.addContact("Hedwig", "5684");
        ContactManagement.addContact("Snape", "1674");

        ContactManagement.deleteContact("Snape");

        List<Contact> foundContacts = ContactManagement.getContactList();

        assertEquals(2, foundContacts.size());

    }

    @Test
    public void updateName_thenVerifyNameIsUpdated(){

        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");

        //add contacts

        ContactManagement.addContact("Harry", "9584");
        ContactManagement.addContact("Hedwig", "5684");
        ContactManagement.addContact("Snape", "1674");

        ContactManagement.updateName("Harry", "Ron");
        String newName = "Ron\r\n";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //actual name
        ContactManagement.getName("9584");

        assertEquals(newName, outContent.toString());

    }

    @Test
    public void updateNumber_thenVerifyNumberIsUpdated(){
        //Create three contacts
        Contact contact1 = new Contact("Harry", "9584");

        //add contacts
        ContactManagement.addContact("Harry", "9584");
        ContactManagement.addContact("Hedwig", "5684");
        ContactManagement.addContact("Snape", "1674");

        ContactManagement.updatePhoneNumber("Harry", "1234");
        String newPhoneNumber = "1234\r\n";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //actualPhoneNumber;
        ContactManagement.getPhoneNumber("Harry");

        assertEquals(newPhoneNumber, outContent.toString());
    }


    @Test
    public void searchContact_thenVerifyContactIsShown(){

        //add contacts
        ContactManagement.addContact("Harry", "9584");
        ContactManagement.addContact("Hedwig", "5684");
        ContactManagement.addContact("Snape", "1674");


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ContactManagement.searchContact("H");

        String expectedOutput  = "Name 'Harry', PhoneNumber 9584\r\nName 'Hedwig', PhoneNumber 5684\r\n";

        assertEquals(expectedOutput, outContent.toString());

    }


    @Test
    public void printContactList_VerifyAllContactsArePrinted() {

        //add contacts
        ContactManagement.addContact("Harry", "9584");
        ContactManagement.addContact("Hedwig", "5684");
        ContactManagement.addContact("Snape", "1674");


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // After this all System.out.println() statements will come to outContent stream.

        ContactManagement.printContactList();

        //Validate the output with expected String
        String expectedOutput  = "Name 'Harry', PhoneNumber 9584\r\nName 'Hedwig', PhoneNumber 5684\r\nName 'Snape', PhoneNumber 1674\r\n";

        // Do the actual assertion.
        assertEquals(expectedOutput, outContent.toString());
    }




}
