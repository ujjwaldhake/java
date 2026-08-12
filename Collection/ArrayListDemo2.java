package Collection;

import java.util.ArrayList;

 class Student {

    
}

public class ArrayListDemo2 {
    public static void main(String[] args) {
       // int [] values = new int[20];
        ArrayList values = new ArrayList() ;// no size provided // default size 10 //it is object type array
        // no type saftey 
        // iserting calues inside arraylist
        values.add("Ujjwal");//String data 
        values.add(20);// int data 
        values.add(30.30);
        values.add(new ArrayIndexOutOfBoundsException());// exceptuion type
        values.add(new Student());// student class object
         //adding value : threshold percentage 
         // 2nd Arraykist
        //  System.out.println(values.get(0));
        //  System.out.println(values.get(1));
        //  System.out.println(values.get(2));
        //  System.out.println(values.get(3));
        //  System.out.println(values.get(4));
         ArrayList names = new ArrayList<>();//ujjwal,abc,dhake
         names.add("ujjwal");
         names.add("ABC");
         names.add(new Student());




    }
}
