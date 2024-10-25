package scanner.ej1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the user's first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Reading the user's last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Displaying the welcome message
        System.out.println("Hello, " + firstName + " " + lastName + "!");

        scanner.close();
    }
}

