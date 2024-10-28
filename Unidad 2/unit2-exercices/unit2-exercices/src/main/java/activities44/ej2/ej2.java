package activities44.ej2;

import java.io.FileInputStream;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        String filePath = "D:\\image.jpg";

        try {
            String format = detectImageFormat(filePath);
            System.out.println("The format is: " + format);
        } catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
    }

    public static String detectImageFormat(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] header = new byte[8];

            if (fis.read(header) != -1) {
                if (header[0] == 0x42 && header[1] == 0x4D) {
                    return "BMP";
                } else if (header[0] == 0x47 && header[1] == 0x49 && header[2] == 0x46) {
                    if ((header[3] == 0x38 && (header[4] == 0x39 || header[4] == 0x37)) && header[5] == 0x61) {
                        return "GIF";
                    }
                } else if (header[0] == 0x00 && header[1] == 0x00 && header[2] == 0x01 && header[3] == 0x00) {
                    return "ICO";
                } else if (header[0] == (byte) 0xFF && header[1] == (byte) 0xD8 && header[2] == (byte) 0xFF) {
                    return "JPEG";
                } else if (header[0] == (byte) 0x89 && header[1] == 0x50 && header[2] == 0x4E && header[3] == 0x47) {
                    return "PNG";
                } else {
                    return "wrong format";
                }
            }
        }
        return "It wasnt possible to read the file";
    }
}
