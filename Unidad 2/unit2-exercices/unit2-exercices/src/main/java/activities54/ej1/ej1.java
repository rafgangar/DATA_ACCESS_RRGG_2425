package activities54.ej1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        boolean append = false;
        if (file.exists()) {
            System.out.print("The file already exists. ");
            String choice = scanner.nextLine();
            append = choice.equalsIgnoreCase("a");
        }

        try (FileWriter writer = new FileWriter(file, append)) {
            System.out.println("Enter sentences. Type 'end' to finish:");
            int lineNumber = append ? countLines(file) + 1 : 1;
            while (true) {
                System.out.print("Line " + lineNumber + ": ");
                String sentence = scanner.nextLine();
                if (sentence.equalsIgnoreCase("end")) break;
                writer.write(lineNumber + ". " + sentence + System.lineSeparator());
                lineNumber++;
            }
            System.out.println("Text saved in " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    private static int countLines(File file) {
        int lines = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
                lines++;
            }
        } catch (IOException e) {
            System.out.println("Error counting lines: " + e.getMessage());
        }
        return lines;
    }
}
