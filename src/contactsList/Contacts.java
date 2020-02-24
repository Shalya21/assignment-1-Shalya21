package contactsList;

import java.util.LinkedList;

public class Contacts implements Comparable<Contacts> {
    private LinkedList<Integer> mobileNo;
    private String name;
    private String lastName;
    private Contacts contact;
    private String email;

    public Contacts(String name, String lastName, String email, LinkedList<Integer> mobileNo) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mobileNo = mobileNo;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedList<Integer> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(LinkedList<Integer> mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contacts getContact() {
        return contact;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }


    public int compareTo(Contacts contact) {
        return name.compareTo(contact.name);
    }


}
