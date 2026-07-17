package FileHandling.BufferInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\demo3.txt");
   

                BufferedInputStream bis = new BufferedInputStream(fis);

                int size = bis.available();
                System.out.println(size);
                byte b[]=new byte[size];
                bis.read(b);
                String s = new String(b);
                System.out.println(s);
                ;
    }
    
}
