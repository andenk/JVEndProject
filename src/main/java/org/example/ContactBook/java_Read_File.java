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
    public static void main(String[] args){
    
    //File makeFile = new File("C:\\Users\\MyName\\filename.txt"); 
    //To save the textfile to a specific folder

    //Creates the textfile
    File makeFile = new File("readMe.txt");
    try{
        if (makeFile.createNewFile()) {
            System.out.println("File created " + makeFile.getName());
        }else{
            System.out.println("File already exists.");
        }
    }catch(IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    //Writes in the created text file
    try{
        FileWriter myWriter = new FileWriter("readMe.txt");
        myWriter.write("Files in Java might be tricky, but as long as it works");
        System.out.println("Successfully wrote to the file.");
        myWriter.close();
    }catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    //Scans the created text file
    try{
        Scanner myReader = new Scanner(makeFile);
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        }catch (FileNotFoundException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
}
}
