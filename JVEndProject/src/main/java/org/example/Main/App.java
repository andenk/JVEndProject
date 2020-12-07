package org.example.Main;

/**
 *This is leone turf
 **/
/**
 * Förklaring på vad som ska matas in
 * scanna in från parametrar från tangenbordet
 * metoder
 * ContactManagement.metodnamn
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {

        boolean run = true;
        Scanner myObj = new Scanner(System.in);

        System.out.println("testtest");

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
                    //printContactList();
                    System.out.println("printContactList();");
                    break;
                case 2:
                    //searchContact();
                    System.out.println("searchContact();");
                    break;
                case 3:
                    //addContact();
                    System.out.println("addContact();");
                    break;
                case 4:
                    //deleteContact();
                    System.out.println("deleteContact();");
                    break;
                case 5:
                    //updatePhoneNumber
                    System.out.println("updatePhoneNumber();");
                    break;
                case 6:
                    //updateName
                    System.out.println("updateName();");
                    break;
                default:
                    System.out.println("Prova igen");
            }
        }

    }

}