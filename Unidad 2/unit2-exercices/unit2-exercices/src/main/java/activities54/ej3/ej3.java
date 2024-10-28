package activities54.ej3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file : ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try (Scanner fileScanner = new Scanner(file)) {
            int lineCount = 0;

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
                lineCount++;

                if (lineCount % 23 == 0) {
                    System.out.println("Press 'space' to continue ");
                    String userInput = scanner.nextLine();
                    if (!userInput.equals(" ")) {
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: ");
        }

        scanner.close();
    }

}
