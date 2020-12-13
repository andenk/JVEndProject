package org.example.ContactBook;

import java.io.File; // Import the File class
import java.io.FileWriter; // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * Filen ska lösa från txt
 * läsa från array
 * skriv till arrayen
 *
 */
public class java_Read_File {

    File makeFile = new File("ContactStorage.txt");
    Scanner writeTest = new Scanner(System.in);


    public void makeMethod() {
        try {
            if (makeFile.createNewFile()) {
                System.out.println("File created " + makeFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void deleteMethod(){
        if (makeFile.delete()){
            System.out.println("Deleted the file: " + makeFile.getName());
        }else{
            System.out.println("Failed to delete the file!");
        }
    }
}
