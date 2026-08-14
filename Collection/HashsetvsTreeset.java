package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashsetvsTreeset {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Dilip");
        hashset.add("suresh");
        hashset.add("sanjay");
        hashset.add("ujjwal");
        hashset.add("tejas");
        
        System.out.println(hashset);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("dilip");
        treeset.add("suresh");
        treeset.add("sanjay");
        treeset.add("ujjwal");
        treeset.add("tejas");
        
        System.out.println(treeset);

    }
    
}
