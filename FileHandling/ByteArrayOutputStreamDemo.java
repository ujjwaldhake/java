package FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\ByteArrayOutputStreamDemo1.txt");
        FileOutputStream fos1 = new FileOutputStream("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\ByteArrayOutputStreamDemo2.txt");
        FileOutputStream fos2 = new FileOutputStream("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\ByteArrayOutputStreamDemo3.txt");
        FileOutputStream fos3 = new FileOutputStream("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\ByteArrayOutputStreamDemo4.txt");
        String str = "my name is ujjwal";

        byte [] bytedata = str.getBytes();
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        bao.write(bytedata);

        bao.writeTo(fos);
        bao.writeTo(fos1);
        bao.writeTo(fos2);
        bao.writeTo(fos3);


        fos.close();
        fos1.close();
        fos2.close();
        fos3.close();
        bao.close();
        
    }
    
}
