package org.example;

public class Contact {
private String name;

private int phoneNumber;

    public Contact(){

    }
    public Contact(String name, int phoneNumber) {
        this.name = name;

        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
