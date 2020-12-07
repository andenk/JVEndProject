package org.example.Main;

/**
 *This is leone turf
 **/

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {

        boolean run = true;
        Scanner myObj = new Scanner(System.in);

        System.out.println(
                "1: Visa kontakter\n" +
                        "2: Sök bland kontakter\n" +
                        "3: Lägg till kontakt\n" +
                        "4: Ta bort kontakt\n" +
                        "0: Avsuta\n");

        while(run) {
            int userChoice = myObj.nextInt();
            myObj.nextLine();
            switch (userChoice) {
                case 0:
                    run = false;
                    break;
                case 1:
                    //listContactsMethod();
                    System.out.println("listContactsMethod();");
                    break;
                case 2:
                    //searchContactsMethod();
                    System.out.println("searchContactsMethod();");
                    break;
                case 3:
                    //addContactMethod();
                    System.out.println("addContactMethod();");
                    break;
                case 4:
                    //removeContactMethod();
                    System.out.println("removeContactMethod();");
                    break;
                default:
                    System.out.println("Prova igen");
            }
        }
    }

}
