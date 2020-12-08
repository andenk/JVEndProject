package org.example.Contact;

import org.example.Contact.Contact;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    Contact contact1 = new Contact("David", "070");

    @Test
    public void setName()
    {
        contact1.setName("Erik");
        assertEquals("Erik",contact1.getName());


    }
    @Test
    public void setPhoneNumber(){
        contact1.setPhoneNumber("073");
        assertEquals("073",contact1.getPhoneNumber());
}

    @Test
    public void getPhoneNumber() {
        assertEquals("070",contact1.getPhoneNumber());
    }

    @Test
    public void getName() {
        assertEquals("David",contact1.getName());
        assertNotEquals("Andreas",contact1.getName());
    }


}
