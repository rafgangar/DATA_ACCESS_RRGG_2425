package filewriter.ej2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first file name: ");
        String file1Name = scanner.nextLine();

        System.out.print("Enter the second file name: ");
        String file2Name = scanner.nextLine();

        List<String> mergedLines = new ArrayList<>();

        try {
            addLinesFromFile(mergedLines, file1Name);
            addLinesFromFile(mergedLines, file2Name);
        } catch (FileNotFoundException e) {
            System.out.println("Error: One of the files was not found.");
            return;
        }

        Collections.sort(mergedLines);

        try (FileWriter writer = new FileWriter("sorted.txt")) {
            for (String line : mergedLines) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Merged and sorted lines have been written to sorted.txt");
        } catch (IOException e) {
            System.out.println("Error writing to sorted.txt: " + e.getMessage());
        }
    }

    private static void addLinesFromFile(List<String> lines, String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            lines.add(fileScanner.nextLine());
        }
        fileScanner.close();
    }
}
