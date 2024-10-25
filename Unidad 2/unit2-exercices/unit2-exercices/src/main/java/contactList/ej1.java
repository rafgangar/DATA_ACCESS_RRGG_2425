package contactList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej1 {
    private static final String FILE_NAME = "contacts.obj";
    private static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        loadContacts();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Show Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addContact(scanner);
                    break;
                case "2":
                    showContacts();
                    break;
                case "3":
                    searchContact(scanner);
                    break;
                case "4":
                    saveContacts();
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }

    private static void loadContacts() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                contacts = (List<Contact>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading contacts: " + e.getMessage());
            }
        }
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        contacts.add(new Contact(name, surname, email, phoneNumber, description));
        System.out.println("Contact added successfully.");
    }

    private static void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Enter full name or phone number to search: ");
        String query = scanner.nextLine();
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.getFullName().equalsIgnoreCase(query) || contact.getPhoneNumber().equals(query)) {
                System.out.println("Found: " + contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contact found with that name or phone number.");
        }
    }

    private static void saveContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }
}
