package String;

public class String1 {

    public static void main(String[] args) {
        String s1= "ujjwal@gmail.com";  
        int i = s1.indexOf("@");
        String s2 = s1.substring(0, i);
        String s3 = s1.substring(i+1, s1.length());
        
        System.err.println("User name "  + s2);
        System.err.println("domain name "  + s3);

    }
    
}
