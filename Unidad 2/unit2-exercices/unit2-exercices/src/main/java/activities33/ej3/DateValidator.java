package activities33.ej3;

import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        activities33.ej3.MyDate date = new activities33.ej3.MyDate();

        try {
            System.out.print("Enter month (1-12): ");
            date.setMonth(scanner.nextInt());

            System.out.print("Enter day: ");
            date.setDay(scanner.nextInt());

            System.out.print("Enter year: ");
            date.setYear(scanner.nextInt());

            System.out.println("The entered date is: " + date);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

