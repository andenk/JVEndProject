package org.example.Contact;

import org.example.Contact.Contact;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  objektet har name David och nummer 070
 *  setName ändrar objektets namn till Erik och tittar om objektets namn är uppdaterat till Erik
 *  set PhoneNumber ändrar objektets nummer till 073 och tittar om objektets nummer är uppdaterat till 073 och att nummret fortfarande inte är 070
 *  getPhoneNumber() hämta nummret från objektet och titta om det är 070
 *  getName kolla att name är David
 *
 */
public class ContactTest {

    Contact contact1 = new Contact("David", "070");

    @Test
    public void TestSetName()
    {
        contact1.setName("Erik");
        assertEquals("Erik",contact1.getName());


    }
    @Test
    public void TestSetPhoneNumber(){
        contact1.setPhoneNumber("073");
        assertEquals("073",contact1.getPhoneNumber());
        assertNotEquals("070",contact1.getPhoneNumber());
}

    @Test
    public void TestGetPhoneNumber() {
        assertEquals("070",contact1.getPhoneNumber());
    }

    @Test
    public void TestGetName() {
        assertEquals("David",contact1.getName());

    }


}
