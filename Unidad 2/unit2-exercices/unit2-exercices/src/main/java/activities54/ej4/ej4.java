package activities54.ej4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file : ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the string : ");
        String searchString = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Error: The file does not exist.");
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            int lineNumber = 0;
            boolean found = false;

            while (fileScanner.hasNextLine()) {
                lineNumber++;
                String line = fileScanner.nextLine();

                if (line.contains(searchString)) {
                    System.out.println("Line " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No lines in: " + searchString);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: ");
        }

        scanner.close();
    }
}

