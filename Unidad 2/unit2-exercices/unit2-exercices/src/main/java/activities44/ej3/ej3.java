package activities44.ej3;

import java.io.FileInputStream;
import java.io.IOException;

public class ej3 {
    static int byteToInt(byte b) {
        return (b < 0) ? (b + 256) : b;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\rafae\\Desktop\\DAM\\Tema-2\\image.bmp";


        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] header = new byte[88];
            fis.read(header);

            // File size (bytes 0 to 3)
            int fileSize = byteToInt(header[0]) +
                    (byteToInt(header[1]) * 256) +
                    (byteToInt(header[2]) * 65536) +
                    (byteToInt(header[3]) * 16777216);
            System.out.println("File Size: " + fileSize + " bytes");

            // Width of the image (bytes 8 to 9)
            int width = byteToInt(header[8]) +
                    (byteToInt(header[9]) * 256);
            System.out.println("Image width: " + width + " pixels");

            // Height of the image (bytes 10 to 11)
            int height = byteToInt(header[10]) +
                    (byteToInt(header[11]) * 256);
            System.out.println("Image height: " + height + " pixels");

            // Bits per pixel (bytes 12 to 13)
            int bitsPerPixel = byteToInt(header[12]) +
                    (byteToInt(header[13]) * 256);
            System.out.println("Bits per Pixel: " + bitsPerPixel);

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

}
