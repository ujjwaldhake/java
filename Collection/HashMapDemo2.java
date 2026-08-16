package Collection;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> emails = new HashMap<>();
        emails.put("ujjwal@gmail.com", "Ujjwal@123");
        emails.put("poojan@gmail.com", "poojan@123");
        emails.put("Tejas@gmail.com", "Tejas@123");
        emails.put("Durvesh@gmail.com", "Durvesh@123");
        emails.put("ujjwal@gmail.com", "Ujjwal@12345");

        System.out.println(emails);
        // {Durvesh@gmail.com=Durvesh@123,
        // poojan@gmail.com=poojan@123,ujjwal@gmail.com=Ujjwal@12345,
        // Tejas@gmail.com=Tejas@123}
        // read operationg
        System.out.println(emails.get("ujjwal@gmail.com")); // given key and getting value
        // remove

        emails.remove("ujjwal@gmail.com");
        System.out.println(emails);
        // {Durvesh@gmail.com=Durvesh@123, poojan@gmail.com=poojan@123,
        // Tejas@gmail.com=Tejas@123}
        System.out.println(emails.containsKey("Tejas@gmail.com"));
        System.out.println(emails.containsValue("Durvesh@123"));
        System.out.println(emails.getOrDefault("xyz@gmail.com", "NOt Found"));1

    }

}
