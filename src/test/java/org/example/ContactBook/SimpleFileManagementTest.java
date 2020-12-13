package org.example.ContactBook;

import org.example.Contact.Contact;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleFileManagementTest {
    SimpleFileManagement fileManagement = new SimpleFileManagement();

    @Test
    public void makeMethodTest() {
        File makeFile = new File("makeMethodTest.txt");
        SimpleFileManagement.makeFile = makeFile;
        fileManagement.makeMethod();

        if(makeFile.exists() && !makeFile.isDirectory()) { 
            assertTrue(true);
            System.out.println("Text successful");
        }else{
            System.out.print("Test failed");
        }

        if (makeFile.delete()){
            System.out.println("Deleted the file: " + makeFile.getName());
        }else{
            System.out.println("The file does not exist");
        }
    }

    // Test för radera fil metoden
    @Test
    public void deleteMethodTest(){
        File makeFile = new File("deleteMethodTest.txt");
        SimpleFileManagement.makeFile = makeFile;
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

        fileManagement.deleteMethod();
        if(makeFile.exists() && !makeFile.isDirectory()) { 
            assertTrue(false);
            System.out.println("Text failed");
        }else{
            assertTrue(true);
            System.out.print("Test succesful");
        }

    }

    @Test
    //Test för spara till fil metoden
    public void writeToFileMethodTest() throws IOException {
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        Contact contact = new Contact("Gustav", "0705678399");
        contactList.add(contact);
        
        try {
            FileWriter myWriter = new FileWriter("writeMethodTest.txt");
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

        File makeFile = new File("writeMethodTest.txt");
        try {
            Scanner myReader = new Scanner(makeFile);

            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                String phoneNumber = myReader.nextLine();
                Contact contact1 = new Contact(name, phoneNumber);
                System.out.println(contact1);
                assertEquals("Gustav", contact1.getName());
                assertEquals("0705678399", contact1.getPhoneNumber());
            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        if (makeFile.delete()){
            System.out.println("Deleted the file: " + makeFile.getName());
        }else{
            System.out.println("Failed to delete the file!");
        }
    }

    @Test
    //Test för ta up från fil metoden
    public void readFromFileMethodTest(){
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        Contact contact = new Contact("Adrian", "0765678311");
        contactList.add(contact);
        
        try {
            FileWriter myWriter = new FileWriter("ReadMethodTest.txt");
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
        File myObj = new File("ReadMethodTest.txt");
        ArrayList<Contact> contactList1 = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                String phoneNumber = myReader.nextLine();
                Contact contact1 = new Contact(name, phoneNumber);
                assertEquals("Adrian", contact1.getName());
                assertEquals("0765678311", contact1.getPhoneNumber());
                contactList1.add(contact);
                System.out.println(contactList);
            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

    }
}