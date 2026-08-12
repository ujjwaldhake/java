package Collection;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        // addig value : add (value)
        list1.add("One");
        list1.add("two");
        list1.add("Three");
        list1.add("four");
        list1.add("five");
        list1.add("two");
        list1.add("six");
        
         ArrayList<String> list2 = new ArrayList<>();
        list2.add("Eight");
        list2.add("nine");
        list2.add("ten");
        list2.add("four");
        list2.add("six");
        list2.add("one");

    System.out.println("List 1" + list1);
    System.out.println(list1.size());
    System.out.println("List 1" + list2);
    System.out.println(list2.size());
    //operation
    //req : adding  list2 data adding to list1
    
    // list1.addAll(list2);
    // System.out.println("List 1" + list1);
    // System.out.println(list1.size());
    // //red :  adding list1 data to list2
    // list2.addAll(list1);
    // System.out.println("List 2" + list2);
    // System.out.println(list2.size());
    // start adding second index onwards 
ArrayList<Integer> list3 = new ArrayList<>();
     list3.add(1);
     list3.add(2);
     list3.add(3);
     list3.add(4);
     list3.add(5);
     list3.add(6);
     ArrayList<Integer> list4 = new ArrayList<>();
     list4.add(7);
     list4.add(8);
     list4.add(9);
     list4.add(10);
    //  list4.add(1);
    //  list4.add(2);

    // remove all demo

    System.out.println("List 3" + list3);
    System.out.println(list3.size());
    System.out.println("List 4" + list4);
    System.out.println(list4.size());
    list3.removeAll(list4);
     System.out.println("List 3" + list3);
    System.out.println(list3.size());
     
         
    }
    
}
