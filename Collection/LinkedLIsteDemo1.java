package Collection;

import java.util.LinkedList;

public class LinkedLIsteDemo1 {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        //Index
        l1.add(0,10);
        l1.addLast(70);


        System.out.println(l1.contains(10));
        System.out.println(l1.contains(99));
        System.out.println(l1.size());
        System.out.println(l1.peek());// first elemtnt of linked list 
        
    }
    
}
