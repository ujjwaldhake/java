package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\demo2.txt");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }

    }

}
