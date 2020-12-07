package org.example.ContactManagement;

import org.example.Contact.Contact;

import java.util.ArrayList;
import java.util.List;


/**
 * Static array
 * Ta in parametrar och skapa objektet contact här
 */
public class ContactManagement {

    private static ArrayList<Contact> contactList = new ArrayList();

    //add
    public static void addContact(String name, String PhoneNumber) {

        Contact contact = new Contact(name, PhoneNumber);
        contactList.add(contact);
        System.out.println("Contact added");

    }

    public static ArrayList getContactList() {
        return contactList;
    }

    //Show all
    public static void printContactList(){
        for(Contact contact : contactList){
            System.out.println(contact);
        }
    }


    //Search
    public static void searchContact (String searchLetter){
        for(Contact contact : contactList){
            if(contact.getName().toLowerCase().startsWith(searchLetter.toLowerCase())){
                System.out.println(contact);
            }
        }
    }

    //Update name
    public static void updateName(String oldName, String newName){
        for (Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(oldName)){
                contact.setName(newName);
            }
        }
    }

    //Update number
    public static void updatePhoneNumber(String name, String newNumber){
        for (Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(name)){
                contact.setPhoneNumber(newNumber);
            }
        }
    }


    //Delete
    public static void deleteContact(String contactName){
        for(int i = contactList.size() -1; i>= 0; i--){
            if(contactList.get(i).getName().equalsIgnoreCase(contactName)){
                contactList.remove(i);
                System.out.println("Contact deleted");
            }
        }
    }





}
