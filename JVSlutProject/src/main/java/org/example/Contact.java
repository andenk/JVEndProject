package org.example;

public class Contact {
private String fname;
private String ename;
private int nummber;

    public Contact(String fname, String ename, int nummber) {
        this.fname = fname;
        this.ename = ename;
        this.nummber = nummber;
    }

    public int getNummber() {
        return nummber;
    }

    public void setNummber(int nummber) {
        this.nummber = nummber;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
