package org.example.Crud;

import org.example.Contact.Contact;

public class Crud {

    Contact contact = new Contact;
    //add
    public static void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added");

    }

    //Search
    public static void searchContact (String searchName){
        for(Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(searchName)){
                System.out.println(contact);
            }
        }
    }

    //Search2
    public static void searchContact2 (String searchLetter){
        for(Contact contact : contactList){
            if(contact.getName().startsWith(searchLetter)){
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
    public static void updatePhoneNumber(String oldName, String newNumber){
        for (Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(oldName)){
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
