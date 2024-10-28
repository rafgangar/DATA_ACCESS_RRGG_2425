package activities33.ej2;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day, month, year;

        System.out.print("Enter month (1-12): ");
        month = scanner.nextInt();
        while (month < 1 || month > 12) {
            System.out.print("Invalid month. Enter a month (1-12): ");
            month = scanner.nextInt();
        }

        System.out.print("Enter day: ");
        day = scanner.nextInt();
        while (!isValidDay(day, month)) {
            System.out.print("Invalid day for the given month. Enter day again: ");
            day = scanner.nextInt();
        }

        System.out.print("Enter year: ");
        year = scanner.nextInt();

        System.out.println("The entered date is: " + day + "/" + month + "/" + year);

        scanner.close();
    }

    // check date
    public static boolean isValidDay(int day, int month) {
        if (day < 1) return false;

        switch (month) {
            case 4: case 6: case 9: case 11: // April, June, September, November
                return day <= 30;
            case 2: // February
                return day <= 28; // For simplicity, we're not checking leap years here
            default: // Months with 31 days
                return day <= 31;
        }
    }
}
