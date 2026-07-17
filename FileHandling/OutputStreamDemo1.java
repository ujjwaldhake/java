package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        String data = " my name is ujjwal";
        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\FileOutputStreamdemo2.txt", true);
        // FileOutputStream fos = new FileOutputStream(
        // "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\FileOutputStreamdemo2.html");
        // convert String data into byte formate
        byte[] b = data.getBytes();
        fos.write(b);
        fos.close();

    }

}
