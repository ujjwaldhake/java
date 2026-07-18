package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterdemo {
public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("C:\\Users\\udhake\\Desktop\\java\\FileHandling\\FileWriterDwmo.txt",true);
    String data = "Hello my name is ujjwal";
    char ch []=data.toCharArray();
    fw.write(ch);
    fw.close();
}
    
}
