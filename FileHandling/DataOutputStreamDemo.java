package FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        
        // DataOutputStream dos = new DataOutputStream(new FileOutputStream(
        //         "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\DataOutputstreamdemo.txt"));
        //         dos.writeInt(100);
        //         dos.writeBoolean(false);
               

        DataInputStream dis = new DataInputStream(new FileInputStream(
            "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\DataOutputstreamdemo.txt"));
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            



    }
    
}
