package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Filereaderdemo {
    public static void main(String[] args) throws IOException {
        FileReader fr =  new FileReader("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\FileWriterDwmo.txt");
        int data;
        while((data=fr.read())!=-1){
            System.out.print((char)data);
        }
    }
    
}
