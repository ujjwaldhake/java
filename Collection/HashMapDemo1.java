package Collection;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Ujjwal");
        map.put(102, "Poojan");
        map.put(103, "Tejas");
        map.put(104, "Durvesh");
        map.put(101, "Poojan");
        // {101=Poojan, 102=Poojan, 103=Tejas, 104=Durvesh}
        System.out.println(map);

    }

}
