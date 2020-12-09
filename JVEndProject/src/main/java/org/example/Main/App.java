package org.example.Main;

/**
 *This is leone turf
 **/

/**
 * Förklaring på vad som ska matas in
 * scanna in från parametrar från tangenbordet
 * metoder
 * ContactManagement.metodnamn
 **/

import org.example.ContactManagement.ContactManagement;

import java.util.Scanner;

public class App
{

    private static Scanner scanner = new Scanner(System.in);
    static ContactManagement contactList = new ContactManagement();

    public static void main(String[] args) {

        boolean run = true;
        Scanner myObj = new Scanner(System.in);


        System.out.println(
                "1: Visa kontakter\n" +
                        "2: Sök bland kontakter\n" +
                        "3: Lägg till kontakt\n" +
                        "4: Ta bort kontakt\n" +
                        "5: Uppdatera nummer\n" +
                        "6: Uppdatera namn\n" +
                        "0: Avsuta\n");

        while(run) {
            int userChoice = myObj.nextInt();
            myObj.nextLine();
            switch (userChoice) {
                case 0:
                    run = false;
                    break;
                case 1:
                    contactList.printContactList();
                    break;
                case 2:
                    searchContacts();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    updateNumber();
                    break;
                case 6:
                    updateName();
                    break;
                default:
                    System.out.println("Prova igen");
            }
        }

    }

    private static void searchContacts(){
        System.out.print("Input search: ");
        String search = scanner.nextLine();
        contactList.searchContact(search);
    }

    private static void addNewContact(){
        System.out.print("Input name: ");
        String name = scanner.nextLine();

        System.out.print("Input Phonenumber: ");
        String number = scanner.nextLine();

        contactList.addContact(name, number);
    }

    private static void deleteContact(){
        System.out.print("Input name: ");
        String name = scanner.nextLine();

        contactList.deleteContact(name);
    }

    private static void updateNumber(){
        System.out.print("Input name: ");
        String name = scanner.nextLine();

        System.out.print("Input new phonenumber: ");
        String phoneNumber = scanner.nextLine();

        contactList.updatePhoneNumber(name, phoneNumber);
    }

    private static void updateName(){
        System.out.print("Input current name: ");
        String oldName = scanner.nextLine();

        System.out.print("Input new name: ");
        String newName = scanner.nextLine();

        contactList.updateName(oldName, newName);
    }


}