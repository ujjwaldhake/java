package Collection;

import java.util.*;

public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(4, "Orange");
        fruits.put(5, "Pear");
        fruits.put(6, "Grapes");
        fruits.put(7, "Mango");
        fruits.put(8, "WaterMelon");
        fruits.put(9, "Cherry");

        // fruits.entrySet().stream().forEach(e -> System.out.println(e.getKey()+ "->" +
        // e.getValue()));
        // 1st approch
        Set<Map.Entry<Integer, String>> mapEntries = fruits.entrySet();
        // entrySet() return entry object Emtry is interface 1 pair of key and values
        // are make one entry object
        for (Map.Entry<Integer, String> entry : mapEntries) {
            System.out.println("Key ->" + entry.getKey() + " Values ->" + entry.getValue());
        }
        // ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>(mapEntries);
        // 2nd approch
        Set<Integer> keys = fruits.keySet();
        for (Integer key : keys) {
            System.out.println("Key ->" + key + "Values ->" + fruits.get(key));

        }
        // fruits.putAll(fruits2); same key value pairs datatypes
        Collection<String> allvalues = fruits.values();
        for (String values : allvalues) {
            System.out.println(values);
        }
    }

}
