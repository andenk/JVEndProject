package org.example.Main;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.example.Contact.Contact;
import org.example.contactmanagement.ContactManagement;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * this is leone turf
 */
public class AppTest
{

    @Test
    public void testingAddMethod() {
        ContactManagement contactList = new ContactManagement();

        contactList.addContact("Leo", "000000");
        Contact newContact = new Contact("Leo", "000000");

        List<Contact> newContacts = new ArrayList<>();
        newContacts.add(newContact);

        List<Contact> foundContacts = contactList.getContactList();

        assertEquals(newContacts.size(), foundContacts.size());

    }

    @Test
    public void testingDeleteMethod(){
        ContactManagement contactList = new ContactManagement();
        contactList.addContact("Leo", "1234");
        contactList.addContact("Andreas", "0987");

        contactList.deleteContact("Leo");

        List<Contact> listOfContacts = contactList.getContactList();
        assertEquals(1, listOfContacts.size());
    }



}