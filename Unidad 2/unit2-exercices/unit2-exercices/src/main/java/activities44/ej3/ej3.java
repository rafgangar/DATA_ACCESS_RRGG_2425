package activities44.ej3;

import java.io.FileInputStream;
import java.io.IOException;

public class ej3 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rafae\\Desktop\\DAM\\Tema-2\\image.bmp";  // Replace with the path to your BMP file

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            byte[] header = new byte[54];
            if (fileInputStream.read(header) != 54) {
                System.out.println("Error");
                return;
            }

            int fileSize = ((header[5] & 0xFF) << 24) | ((header[4] & 0xFF) << 16) |
                    ((header[3] & 0xFF) << 8) | (header[2] & 0xFF);

            int width = ((header[21] & 0xFF) << 24) | ((header[20] & 0xFF) << 16) |
                    ((header[19] & 0xFF) << 8) | (header[18] & 0xFF);

            int height = ((header[25] & 0xFF) << 24) | ((header[24] & 0xFF) << 16) |
                    ((header[23] & 0xFF) << 8) | (header[22] & 0xFF);

            int bitsPerPixel = ((header[29] & 0xFF) << 8) | (header[28] & 0xFF);

            System.out.println("BMP File Information:");
            System.out.println("File Size: " + fileSize + " bytes");
            System.out.println("Width: " + width + " pixels");
            System.out.println("Height: " + height + " pixels");
            System.out.println("Bits Per Pixel: " + bitsPerPixel);

        } catch (IOException e) {
            System.out.println("Error reading BMP file: " + e.getMessage());
        }
    }
}
