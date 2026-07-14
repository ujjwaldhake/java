package FileHandling.InputOutputDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\InputOutputDemo\\Source\\img.png");
        int size = fis.available();
        System.out.println(size);
        byte b[] = new byte[size];
        fis.read(b);
        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\InputOutputDemo\\Target\\img2.png");
        fos.write(b);
        fis.close();
        fos.close();
        System.out.println("Done");

    }

}
