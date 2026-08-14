package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo2 {
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
        // for (String string : set) {
        //     System.out.println(string);
        // }
        System.out.println(set.contains("Ujjwal4"));
        System.out.println(set);
       Iterator <String> itr = set.iterator();
       while (itr.hasNext()) {
        System.out.println(itr.next());
       }
       set.remove("Ujjwal1");
        System.out.println(set);
        
    }
    
}
