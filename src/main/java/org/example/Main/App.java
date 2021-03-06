package org.example.Main;


import org.example.ContactBook.SimpleFileManagement;
import org.example.contactmanagement.ContactManagement;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App
{

    private static Scanner scanner = new Scanner(System.in);
    public static ContactManagement contactList = new ContactManagement();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner myObj = new Scanner(System.in);

        contactList.createFile();
        contactList.readFile();

        printMenu();

        while(myObj.hasNext()) {

            String input = myObj.next();
            int userChoice = 0;
            try {
                userChoice = Integer.parseInt(input);
            } catch (NumberFormatException ne) {
                System.out.println("Mata endast in siffror!");
            }

            switch (userChoice) {
                case 0:
                    contactList.writeFile();
                    System.exit(0);
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
                case 7:
                    contactList.deleteFile();
                    break;
                default:
                    System.out.println("Prova igen");
            }
            printMenu();

        }
    }

    private static void printMenu() {
        System.out.println("-------------------\n" +
                "1: Visa kontakter\n" +
                "2: Sök bland kontakter\n" +
                "3: Lägg till kontakt\n" +
                "4: Ta bort kontakt\n" +
                "5: Uppdatera nummer\n" +
                "6: Uppdatera namn\n" +
                "7: Ta bort alla kontakter och kontaktfilen\n" +
                "0: Avsluta\n" +
                "-------------------\n");
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