package org.example.Contact;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.example.Contact.Contact;
import org.junit.Test;

public class ContactTest {
    Contact contact = new Contact();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );


    }

    @Test
    public void getPhoneNumber()
    {

        assertNotNull(contact.getPhoneNumber());
    }




}
