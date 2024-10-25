package files.ej1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        final int BUFFER_SIZE = 128;

        try {
            fIn = new FileInputStream("D:\\testin.txt");
            fOut = new FileOutputStream("D:\\testout.txt");
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fIn.read(buffer)) != -1) {
                fOut.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fIn != null) fIn.close();
                if (fOut != null) fOut.close();
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}
