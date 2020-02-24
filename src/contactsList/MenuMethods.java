package contactsList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MenuMethods {
    private LinkedList<Integer> mobileNo;
    private Contacts contact;
    private String email;
    private LinkedList<Contacts> list = new LinkedList<>();


    public void addContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person");
        System.out.print("First Name:");
        String name = scan.next();
        System.out.print("Last Name: ");
        String lastName = scan.next();
        System.out.print("Enter Mobile No:");
        mobileNo = new LinkedList<>();
        mobileNo.add(scan.nextInt());
        addMobile();
        addemail();
        Contacts contact = new Contacts(name, lastName, email, mobileNo);
        list.add(contact);
        Collections.sort(list);

    }

    private void addMobile() {
        System.out.print("do you want to add another contact? (y/n) : ");
        Scanner scan = new Scanner(System.in);
        String add = scan.next();
        if (add.equals("y")) {
            mobileNo.add(scan.nextInt());
            addMobile();
        } else {
        }
    }

    private void addemail() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add email address? (y/n)");
        String add = scan.next();
        if (add.equals("y")) {
            email = scan.next();

        } else {
            email = "---";
        }

    }


    public void viewContact() {
        System.out.println("---Here are all your contacts---");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("-------- * -------- * -------- * --------");
            System.out.println("First Name: " + list.get(i).getName() + "\nLast Name: " + list.get(i).getLastName());
            System.out.print("Mobile no: ");
            for (int j = 0; j < mobileNo.size(); j++)
                System.out.print(list.get(i).getMobileNo().get(j) + " ");
            System.out.println();
            System.out.println("Email Address: " + list.get(i).getEmail());
            System.out.println("-------- * -------- * -------- * --------");

        }
    }


    public void searchContact() {
        System.out.println("You could search for a contact from their first names:");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(firstName)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count + " match are found :");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(firstName)) {
                    System.out.println("-------- * -------- * -------- * --------");
                    System.out.println("First Name: " + list.get(i).getName() + "\nLast Name: " + list.get(i).getLastName());
                    System.out.print("Mobile No: ");
                    for (int j = 0; j < mobileNo.size(); j++) {
                        System.out.print(list.get(i).getMobileNo().get(j) + " ");
                    }
                    System.out.println();
                    System.out.println("Email Address: " + list.get(i));
                    System.out.println("-------- * -------- * -------- * --------");
                }

            }
        } else
            System.out.println("no match found.");

    }

    public void deleteContact() {
        System.out.println("Here are all your contacts: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).getName() + " " + list.get(i).getLastName());
        }
        System.out.println("Press the number against the contact to delete it:");
        Scanner scan = new Scanner(System.in);
        int delete = scan.nextInt();

        System.out.println(list.get(delete - 1).getName() + "'s contact deleted from list!");
        list.remove(delete - 1);

    }


}
