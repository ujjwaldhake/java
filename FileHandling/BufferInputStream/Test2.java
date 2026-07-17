package FileHandling.BufferInputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
                        String s = "hello buffered ";

             FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\udhake\\Desktop\\java\\FileHandling\\Bufferoutstreamdemo.txt", true);
                BufferedOutputStream bos = new BufferedOutputStream(fos);

                byte []b = s.getBytes();
                bos.write(b);
                    System.out.println("done");
                    bos.close();
    }
}
