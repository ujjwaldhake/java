package FileHandling;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String str = "my name is ujjwal";
        byte []b= str.getBytes();
        ByteArrayInputStream bis= new ByteArrayInputStream(b);
        int size = bis.available();
        byte []b1= new byte[size];
        bis.read(b1);
        System.out.println(new String(b1));
        
        
        }
    
}
