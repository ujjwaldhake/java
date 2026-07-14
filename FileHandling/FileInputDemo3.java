package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDemo3 {

    public static void main(String[] args) throws IOException {

        // Open the file for reading
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\demo.txt");

        // Variable to store total number of words
        int wordcount = 0;

        // Stores each byte read from the file
        int currentByteData;

        // Indicates whether the next non-space character
        // should be treated as the start of a new word
        boolean isWord = true;

        // Read file byte by byte until EOF (-1)
        while ((currentByteData = fis.read()) != -1) {

            // If current character is a space or newline,
            // the next non-space character will start a new word
            if (currentByteData == ' ' || currentByteData == '\n') {

                isWord = true;

            }
            // If a non-space character is found and we are
            // expecting the start of a word
            else if (isWord) {

                // Count the new word
                wordcount++;

                // Mark that we are currently inside a word
                isWord = false;
            }
        }

        // Print total number of words found
        System.out.println("Total Words: " + wordcount);

        // Close the stream and release system resources
        fis.close();
    }
}