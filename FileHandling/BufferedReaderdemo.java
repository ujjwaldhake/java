package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderdemo {
    public static void main(String[] args) throws Exception {
        FileReader fw = new FileReader("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\FileWriterDwmo.txt");
        BufferedReader bfr = new BufferedReader(fw);
      // System.out.println(bfr.readLine());
      String line;
      while ((line = bfr.readLine())!=null) {
        System.out.println(line);
        
      }
    }
    
}
