package hust.soict.dsai.garbage;

import java.io.*;
import java.nio.file.*;

public class NoGarbage {
    public static void main(String[] args) {
        String filePath = "large_file.txt";

        try {
            // Create a large file for testing if it doesn't exist
            if (!Files.exists(Paths.get(filePath))) {
                createLargeFile(filePath);
            }

            System.out.println("Starting to read file with StringBuffer...");
            long startTime = System.currentTimeMillis();

            // Read file using StringBuffer
            try (FileReader fr = new FileReader(filePath)) {
                StringBuilder content = new StringBuilder();
                int character;
                int charCount = 0;

                while ((character = fr.read()) != -1) {
                    content.append((char) character);  // More efficient, modifies the same buffer
                    charCount++;

                    if (charCount % 1000000 == 0) {
                        System.out.println("Read " + charCount + " characters...");
                    }
                }

                System.out.println("Final string length: " + content.length());
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startTime) + " ms");

        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory Error occurred!");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Error occurred!");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void createLargeFile(String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Create a 4GB file
            for (int i = 0; i < 100000000; i++) {
                writer.write("This is a test line to create a large file.\n");
            }
        }
    }
}