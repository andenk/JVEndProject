package org.example.contactmanagement;

import org.example.Contact.Contact;
import org.example.ContactBook.SimpleFileManagement;

import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
 * Static array
 * Ta in parametrar och skapa objektet contact här
 */
public class ContactManagement {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void createFile() throws FileNotFoundException {
        SimpleFileManagement simpleFileManagement = new SimpleFileManagement();
        simpleFileManagement.makeMethod();
    }

    public void deleteFile() throws FileNotFoundException {
        SimpleFileManagement simpleFileManagement = new SimpleFileManagement();
        simpleFileManagement.deleteMethod();
    }



    //add
    public void addContact(String name, String phoneNumber) {

        Contact contact = new Contact(name, phoneNumber);
        contactList.add(contact);
        System.out.println("Contact added");

    }

    public ArrayList<Contact> getContactList() {

        return contactList;
    }

    public void getPhoneNumber(String name){
        for(Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(name))
                System.out.println(contact.getPhoneNumber());
        }
    }

    public void getName(String phoneNumber){
        for(Contact contact : contactList){
            if(contact.getPhoneNumber().equalsIgnoreCase(phoneNumber))
                System.out.println(contact.getName());
        }
    }


    //Show all
    public void printContactList(){
        for(Contact contact : contactList){
            System.out.println(contact);
        }
    }


    //Search
    public void searchContact (String searchLetter){
        for(Contact contact : contactList){
            if(contact.getName().toLowerCase().startsWith(searchLetter.toLowerCase())){
                System.out.println(contact);
            }
        }
    }

    //Update name
    public void updateName(String oldName, String newName){
        for (Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(oldName)){
                contact.setName(newName);
                System.out.println("Contact name updated");
            }
        }
    }

    //Update number
    public void updatePhoneNumber(String name, String newNumber){
        for (Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(name)){
                contact.setPhoneNumber(newNumber);
                System.out.println("Contact number updated");
            }
        }
    }


    //Delete
    public void deleteContact(String contactName){
        for(int i = contactList.size() -1; i>= 0; i--){
            if(contactList.get(i).getName().equalsIgnoreCase(contactName)){
                contactList.remove(i);
                System.out.println("Contact deleted");
            }
        }
    }





}
