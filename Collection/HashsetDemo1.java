package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashsetDemo1 {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        set.add("Ujjwal");
        set.add("Ujjwal1");
        set.add("Ujjwal2");
        set.add("Ujjwal3");
        set.add("Ujjwal4");
        set.add("Ujjwal5");
        set.add("Ujjwal1");

        System.out.println(set.size());
        System.out.println(set);
        ArrayList <String> list = new ArrayList<>();
        list.add("ujjwal11");
        list.add("ujjwal22");
        list.add("ujjwal33");
        list.add("ujjwal44");
        list.add("ujjwal55");

        set.addAll(list);
        System.out.println(set.size());
        System.out.println(set);
        
    }
    
}
