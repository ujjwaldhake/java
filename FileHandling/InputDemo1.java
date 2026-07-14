package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\demo.txt");
        // get size of array
        int size = fis.available();
        // data is commin in byte format so we need to stor eit in byte array
        // creta empty array of bytes

        byte b[] = new byte[size];
        fis.read(b);// it will read all data and store and in byte b (read + store )

        String str = new String(b);
        System.out.println(str);
    }

}
