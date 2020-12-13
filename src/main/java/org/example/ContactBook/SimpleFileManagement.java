package org.example.ContactBook;

import org.example.Contact.Contact;

import java.io.File; // Import the File class
import java.io.FileWriter; // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException; // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files


public class SimpleFileManagement {

    File makeFile = new File("ContactStorage.txt");
    Scanner writeTest = new Scanner(System.in);


    public void writeToFileMethod(ArrayList<Contact> contactList) {
        try {
            FileWriter myWriter = new FileWriter("ContactStorage.txt");

            for (Contact str : contactList){
                myWriter.write((str.getName() + System.lineSeparator()));
                myWriter.write((str.getPhoneNumber() + System.lineSeparator()));
            }
            System.out.println("Successfully wrote to the file.");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public ArrayList<Contact> readFromFileMethod() {
        File myObj = new File("ContactStorage.txt");
        ArrayList<Contact> contactList = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                String phoneNumber = myReader.nextLine();
                Contact contact = new Contact(name, phoneNumber);
                contactList.add(contact);
            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return contactList;
    }

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
