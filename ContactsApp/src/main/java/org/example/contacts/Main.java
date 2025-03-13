package org.example.contacts;
import org.example.contacts.model.Person;
import org.example.contacts.service.ContactsService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactsService contactService = new ContactsService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== CONTACTS APP ====");
            System.out.println("1 - Add Contact");
            System.out.println("2 - Remove Contact");
            System.out.println("3 - Find Contact by Phone");
            System.out.println("4 - List All Contacts");
            System.out.println("5 - Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Person newPerson = new Person(name, phone, email);
                    contactService.addPerson(newPerson);
                    System.out.println("Contact added: " + newPerson);
                    break;

                case "2":
                    System.out.print("Enter the phone number of the contact to remove: ");
                    String removePhone = scanner.nextLine();
                    contactService.removePerson(removePhone);
                    System.out.println("Contact with phone number " + removePhone + " removed (if existed).");
                    break;

                case "3":
                    System.out.print("Enter the phone number to search: ");
                    String searchPhone = scanner.nextLine();
                    Person found = contactService.findPersonByPhone(searchPhone);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("No contact found.");
                    }
                    break;

                case "4":
                    List<Person> allPersons = contactService.listAll();
                    System.out.println("----- ALL CONTACTS -----");
                    for (Person p : allPersons) {
                        System.out.println(p);
                    }
                    break;

                case "5":
                    System.out.println("Exiting the application...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}